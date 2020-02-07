package com.insure.client;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class Signature {

    private String msg;
    private String hash;
    private String encryptedHash;
    private PrivateKey privatekey;
    private PublicKey publickey;

    public Signature() {
    }

    //Cria o Hash da mensagem a enviar
    private String createHash(String msg) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return Base64.getEncoder().encodeToString(digest.digest(msg.getBytes("UTF-8")));
    }

    //Encripta a mensagem
    private String encryptedHash(String hash, String filename) throws Exception {
        EncryptPrivate PrivateEncrypt = new EncryptPrivate();
        this.privatekey = PrivateEncrypt.getPrivate(filename);
        return PrivateEncrypt.encryptText(hash, privatekey);
    }

    //Desincripta a mensagem
    private String decryptHash(String fileName, String encryptedHash) throws Exception {
        DecryptPublic privateDecrypt = new DecryptPublic();
        publickey = privateDecrypt.getPublic(fileName);
        return privateDecrypt.decryptText(encryptedHash, publickey);
    }

    public String createSignature(String fileName, String content) throws Exception {
        String hash = createHash(content);
        return encryptedHash(hash, fileName);
    }

    //verificaçao da assinatura:
    public boolean verifySignature(String content, String encryptedHash, String filename) throws Exception {
        String decryptedHash = this.decryptHash(filename, encryptedHash);
        String Hash = createHash(content);
        if (hash.equals(decryptedHash)) {
            return true;
        } else throw new UserException("You are not allowed to add document do this claim. Please try again");
    }

    //public static void main(String[] args) throws Exception {
    //Signature signature=new Signature("c","keys\\user1\\user1PrivateKey");
    //System.out.println(signature.getMsg()+"\n");
    //System.out.println(signature.getHash()+"\n");
    // System.out.println(signature.getEncryptedHash()+"\n");
    //}
}


