package com.insure.client;

import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;
import com.insure.client.gen.Exception_Exception;
import com.insure.client.gen.UserException_Exception;

import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.io.File;

public class Main {
    private static ClaimDataStore docStorage;

    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8090/docstorage";
        ClaimDataStoreService dss = new ClaimDataStoreService();

        ClaimDataStore dataStore = dss.getClaimDataStorePort();

        ((BindingProvider) dataStore).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

        runInterface(dataStore);
    }

    public static void runInterface(ClaimDataStore dataStore) throws Exception {

        String userID = JOptionPane.showInputDialog("Insert personal ID:");
        while (userID.equals("")) { //repeat user ID request until inserted value not null
            userID = JOptionPane.showInputDialog("Insert personal ID:");
        }
        int numb = Integer.parseInt(userID);
        String findUser = ("keys\\user" + userID + "PublicKey");//VALIDATE PERSONAL ID
        File f = new File(findUser);

        if (f.exists()) {
            while (true) {
                String method = JOptionPane.showInputDialog(
                        "Insert what you wish to do:" + "\n" +
                                "1 - Create a Claim" + "\n" +
                                "2 - Add a Document to a Claim" + "\n" +
                                "3 - Retrieve Documents from a Claim" + "\n" +
                                "\n" +
                                "4 - Exit");

                if (method.equals("4")) {
                    break;
                }

                if (method.equals("1")) {
                    String description = JOptionPane.showInputDialog("Insert the description of your Claim");
                    while (description.equals("")) {
                        description = JOptionPane.showInputDialog("Insert the description of your Claim");
                    }
                    int claimID = dataStore.createClaim(description, numb);
                    String claim = dataStore.printClaim(claimID);
                    JOptionPane.showMessageDialog(null, "Your Claim was created: " + claim);
                }

                if (method.equals("2")) {
                    for (int i = 1; i <= dataStore.size(); i++) {
                        System.out.println(dataStore.printClaim(i));
                    }
                    try {
                        String claimAsString = JOptionPane.showInputDialog("Insert Claim ID:");
                        while (claimAsString.equals("")) {
                            claimAsString = JOptionPane.showInputDialog("Insert Claim ID:");
                        }
                        int claimID = Integer.parseInt(claimAsString);
                        String content = JOptionPane.showInputDialog("Insert the content of the document");
                        Signature sig = new Signature();
                        String signature = sig.createSignature("keys\\user" + userID + "\\user" + userID + "PrivateKey", content);
                        System.out.println(signature);
                        dataStore.createAddDocument(numb, claimID, content, signature);
                        JOptionPane.showMessageDialog(null, "You added a document to your Claim \nPress'OK' to continue");

                    } catch (UserException_Exception | Exception_Exception e) {
                        String message = e.getMessage();
                        JOptionPane.showMessageDialog(null, message);
                    }
                }


                if (method.equals("3")) { //3 - Retrieve Documents from a Claim
                    String uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                    while (uuid.equals("")) { //repeat Claim ID request until inserted value not null
                        uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                    }
                    int claimID = Integer.parseInt(uuid);
                    while (dataStore.getClaimFromID(claimID) == null) {//repeat Claim ID request until a claim with given iD is found in the dataStore
                        JOptionPane.showMessageDialog(null, "Claim ID not found");
                        JOptionPane.showInputDialog("Insert Claim ID:");
                    }
                    JOptionPane.showMessageDialog(null, dataStore.retrieveDocuments(claimID,numb));//Show all documents of the claim
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "User ID not found");
            runInterface(dataStore);
        }
    }
}




