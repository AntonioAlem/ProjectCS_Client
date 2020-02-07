package com.insure.client;

import com.insure.client.gen.*;

import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.io.File;
import java.lang.Exception;

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

        if (userID.matches("[0-9]+") && userID.length() > 0) {
            int numb = Integer.parseInt(userID);
            String findUser = ("keys\\user" + userID + "PublicKey");//VALIDATE PERSONAL ID

            File f = new File(findUser);
            if (f.exists()) {
                if (numb <= 5) {
                    JOptionPane.showMessageDialog(null, "Welcome InSure Officer");
                } else {
                    JOptionPane.showMessageDialog(null, "Welcome InSure Client");
                }
                while (true) {
                    String method = JOptionPane.showInputDialog(
                            "Welcome to InSure," + "\n" +
                                    "Insert what you wish to do:" + "\n" +
                                    "\n" +
                                    "1 - Create a Claim" + "\n" +
                                    "2 - Add a Document to a Claim" + "\n" +
                                    "3 - Retrieve Documents from a Claim" + "\n" +
                                    "4 - Delete a Document" + "\n" +
                                    "5 - Update a Document" + "\n" +
                                    "\n" +
                                    "6 - Exit");
                    while (!method.matches("[0-6]+") && method.length() > 0) {
                        method = JOptionPane.showInputDialog("Welcome to InSure," + "\n" +
                                "Insert what you wish to do:" + "\n" +
                                "\n" +
                                "1 - Create a Claim" + "\n" +
                                "2 - Add a Document to a Claim" + "\n" +
                                "3 - Retrieve Documents from a Claim" + "\n" +
                                "4 - Delete a Document" + "\n" +
                                "5 - Update a Document" + "\n" +
                                "\n" +
                                "6 - Exit");
                    }
                    if (method.equals("6")) {
                        break;
                    }
                    if (method.equals("1")) {
                        if (numb <= 5) {
                            JOptionPane.showMessageDialog(null, "Officers are not allowed to create Claims");
                        } else {
                            String description = JOptionPane.showInputDialog("Insert the description of your Claim");
                            while (description.equals("")) {
                                description = JOptionPane.showInputDialog("Insert the description of your Claim");
                            }
                            int claimID = dataStore.createClaim(description, numb);
                            String claim = dataStore.printClaim(claimID);
                            JOptionPane.showMessageDialog(null, "Your Claim was created: " + claim);
                        }
                    }

                    if (method.equals("2")) { //3 - Add Document to a Claim
                        for (int i = 1; i <= dataStore.size(); i++) {  //prints existing claims
                            System.out.println(dataStore.printClaim(i));
                        }
                        try {
                            String claimAsString = JOptionPane.showInputDialog("Insert Claim ID:");
                            while (claimAsString.equals("") || (!claimAsString.matches("[0-9]+") && userID.length() > 0)) {
                                claimAsString = JOptionPane.showInputDialog("Insert Claim ID:");
                            }
                            int claimID = Integer.parseInt(claimAsString);
                            String content = JOptionPane.showInputDialog("Insert the content of the document");
                            Signature sig = new Signature();
                            String signature = sig.createSignature("keys\\user" + userID + "\\user" + userID +
                                    "PrivateKey", content);

                            if (numb < 5) {
                                dataStore.createAddDocumentOfficer(numb, claimID, content, signature);
                            } else {
                                dataStore.createAddDocumentClient(numb, claimID, content, signature);
                            }
                            JOptionPane.showMessageDialog(null, "You added a document to your Claim \nPress 'OK' to " +
                                    "continue");
                        } catch (UserException_Exception | Exception_Exception e) {
                            String message = e.getMessage();
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }

                    if (method.equals("3")) { //3 - Retrieve Documents from a Claim
                        try {
                            String uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                            while (uuid.equals("") || (!uuid.matches("[0-9]+") && userID.length() > 0)) {
                                uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                            }
                            int claimID = Integer.parseInt(uuid);
                            if (numb < 5) {
                                JOptionPane.showMessageDialog(null,
                                        dataStore.retrieveDocumentsOfficer(claimID));//Show}
                                // all documents of the claim
                            } else {
                                JOptionPane.showMessageDialog(null, dataStore.retrieveDocumentsClient(claimID,
                                        numb));//Show}
                                // all documents of the claim
                            }
                        } catch (UserException_Exception e) {
                            String message = e.getMessage();
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }
                    if (method.equals("4")) {//4 - Delete a Document  from a Claim
                        try {
                            String uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                            while (uuid.equals("") || (!uuid.matches("[0-9]+") && userID.length() > 0)) {
                                uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                            }
                            int claimID = Integer.parseInt(uuid);
                            String ddid = JOptionPane.showInputDialog("Insert Document ID:");
                            while (ddid.equals("") || (!ddid.matches("[0-9]+") && userID.length() > 0)) {
                                ddid = JOptionPane.showInputDialog("Insert Document ID:");
                            }
                            int docID = Integer.parseInt(ddid);
                            if (numb < 5) {
                                dataStore.deleteDocumentsOfficer(claimID, docID);
                            } else {
                                dataStore.deleteDocumentsClient(claimID, docID, numb);
                            }
                        } catch (UserException_Exception e) {
                            String message = e.getMessage();
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }
                    if (method.equals("5")) {//5 - Update a Document  from a Claim
                        try {
                            String uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                            while (uuid.equals("") || (!uuid.matches("[0-9]+") && userID.length() > 0)) {
                                uuid = JOptionPane.showInputDialog("Insert Claim ID:");
                            }
                            int claimID = Integer.parseInt(uuid);
                            String ddid = JOptionPane.showInputDialog("Insert Document ID:");
                            while (ddid.equals("") || (!ddid.matches("[0-9]+") && userID.length() > 0)) {
                                ddid = JOptionPane.showInputDialog("Insert Document ID:");
                            }
                            int docID = Integer.parseInt(ddid);
                            String content = JOptionPane.showInputDialog("Insert the new content of the document");
                            Signature sig = new Signature();
                            String signature = sig.createSignature("keys\\user" + userID + "\\user" + userID +
                                    "PrivateKey", content);
                            Document doc = dataStore.getDocFromIDDS(docID, numb);
                            if (doc.getLastUser() != numb) {
                                JOptionPane.showMessageDialog(null,
                                        "This document was last updated by: " + doc.getLastUser());
                            }
                            if (numb < 5) {
                                dataStore.updateDocumentOfficer(numb, claimID, docID, content, signature);
                            } else {
                                dataStore.updateDocumentClient(numb, claimID, docID, content, signature);
                            }
                            JOptionPane.showMessageDialog(null, "You updated a document to a Claim \nPress 'OK' to " +
                                    "continue");
                        } catch (UserException_Exception e) {
                            String message = e.getMessage();
                            JOptionPane.showMessageDialog(null, message);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "User ID not found");
                runInterface(dataStore);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid User ID");
            runInterface(dataStore);
        }
    }
}







