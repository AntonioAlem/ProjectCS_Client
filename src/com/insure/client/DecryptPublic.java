package com.insure.client;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class DecryptPublic {
    private Cipher cipher;

    public DecryptPublic() throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.cipher = Cipher.getInstance("RSA");
    }

    public PublicKey getPublic(String filename) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public String decryptText(String msg, Key key) throws InvalidKeyException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        this.cipher.init(Cipher.DECRYPT_MODE, key);
        return new String (cipher.doFinal(Base64.getDecoder().decode(msg)), "UTF-8");
    }

    public static void main(String[] args) throws Exception {

        DecryptPublic v1 = new DecryptPublic();
        PublicKey publicKey = v1.getPublic("keys\\user1\\user1PublicKey");

        System.out.println("Enter the original message:");
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        String hash = Base64.getEncoder().encodeToString(digest.digest(msg.getBytes("UTF-8")));

        System.out.println("Encrypted Hash: ");
        in = new Scanner(System.in);
        String encrypted_hash = in.nextLine();
        String received_hash = v1.decryptText(encrypted_hash, publicKey);

        System.out.println("Message: " + msg +
                "\nmessage Hash: " + hash +
                "\nReceived Hash: " + received_hash);
    }
}
