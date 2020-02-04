package com.insure.client;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class SigVerification {
    private Cipher cipher;

    public SigVerification() throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.cipher = Cipher.getInstance("RSA");
    }

    public PublicKey getPublic(String filename) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public byte[] decryptBytes(String msg, Key key) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        this.cipher.init(Cipher.DECRYPT_MODE, key);
        return this.cipher.doFinal(Base64.getDecoder().decode(msg));
    }

    public static void main(String[] args) throws Exception {
        SigVerification v1 = new SigVerification ();
        PublicKey publicKey = v1.getPublic("keys\\user1\\user1PublicKey");

        System.out.println("Enter the original message:");
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        String hash = Base64.getEncoder().encodeToString(digest.digest(msg.getBytes("UTF-8")));

        System.out.println("Encrypted Hash: ");
        in = new Scanner(System.in);
        String encrypted_hash = in.nextLine();
        String received_hash = Base64.getEncoder().encodeToString(v1.decryptBytes(encrypted_hash, publicKey));

        System.out.println("Message: " + msg +
                "\nmessage Hash: " + hash +
                "\nReceived Hash: " + received_hash);
    }
}
