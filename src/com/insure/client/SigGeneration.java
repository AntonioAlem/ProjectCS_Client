package com.insure.client;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class SigGeneration {
    private Cipher cipher;

    public SigGeneration() throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.cipher = Cipher.getInstance("RSA");
    }

    // https://docs.oracle.com/javase/8/docs/api/java/security/spec/PKCS8EncodedKeySpec.html
    public PrivateKey getPrivate(String filename) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    public String encryptText (byte [] msg, PrivateKey key)
            throws Exception {
        cipher.init(1, key);
        return Base64.getEncoder().encodeToString(cipher.doFinal(msg));
    }

    public static void main (String[] args) throws Exception {
        SigGeneration c1 = new SigGeneration();
        PrivateKey privateKey = c1.getPrivate("keys\\user1\\user1PrivateKey");
        String msg = "Cryptography is fun!";
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(msg.getBytes());
        String encrypted_hash = c1.encryptText(hash, privateKey);

        System.out.println("Original Message: " + msg +
                "\nHash: " + Base64.getEncoder().encodeToString(hash) +
                "\nEncrypted Hash: " + encrypted_hash);
    }
}
