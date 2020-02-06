package com.insure.client;

import com.insure.client.gen.*;

import javax.swing.*;
import javax.swing.text.Document;
import javax.xml.ws.BindingProvider;
import java.io.File;
import java.io.IOException;
import java.lang.Exception;

public class Main {
    private static ClaimDataStore docStorage;

    public static void main(String[] args) {
        String url = "http://localhost:8090/docstorage";
        ClaimDataStoreService dss = new ClaimDataStoreService();

        ClaimDataStore dataStore = dss.getClaimDataStorePort();

        ((BindingProvider) dataStore).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

        /*
        int claimID1 = dataStore.createClaim("Vehicle Claim");
        Claim c1 = dataStore.getClaimFromID(claimID1);
        System.out.println(dataStore.printClaim(claimID1));
        */

        runInterface(dataStore);
    }

    public static void runInterface(ClaimDataStore dataStore) {
        String userID= JOptionPane.showInputDialog("Insert personal ID:");
        int numb=Integer.parseInt(userID);
        String user_number = "user"+userID;
        //VALIDATE PERSONAL ID

        //System.out.println(user_number);

        String findUser=("keys\\user"+userID+"PublicKey");

        //System.out.println(findUser);

        File f =new File("keys\\user"+userID+"PublicKey");

        if (f.exists()) {
            while (true) {
                try {
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
                        int claimID = dataStore.createClaim(description);
                        String claim = dataStore.printClaim(claimID);
                        JOptionPane.showMessageDialog(null, "Your Claim was created: " + claim);
                    }
                    if (method.equals("2")) {
                        String claimAsString = JOptionPane.showInputDialog("Insert Claim ID:");
                        try{
                        int claimID = Integer.parseInt(claimAsString);

                        String content = JOptionPane.showInputDialog("Insert the content of the document");
                        Signature sig = new Signature();
                        sig.createSignature("keys\\user"+userID + "\\user"+userID+"PrivateKey",content);
                        String signature= sig.toString();
                        dataStore.createAddDocument(numb, claimID, content, signature);
                        JOptionPane.showMessageDialog(null, "You added a document in your Claim \nPress'OK' to continue");
                    } catch (ClaimIDNotFoundException_Exception e) {
                            JOptionPane.showMessageDialog(null, "Claim"+ claimAsString +" added a document in your Claim");
                        }

                        }

                    if (method.equals("3")) {
                        String uuid = JOptionPane.showInputDialog("Insert Claim ID:");

                        int claimID = Integer.parseInt(uuid);
                       // Claim claimID = dataStore.getClaimFromID((Integer.parseInt(uuid)));

                        System.out.println(dataStore.retrieveDocuments(claimID));
                        JOptionPane.showMessageDialog(null, dataStore.retrieveDocuments(claimID));
//                      //

                       while (claimID != Integer.parseInt(userID))
                            uuid = JOptionPane.showInputDialog("This claim belongs to another user. \n Insert a valid claim ID:");

                        String docID= JOptionPane.showInputDialog("Insert document ID:");

                        String docToString = dataStore.retrieveDocuments(Integer.parseInt(uuid), Integer.parseInt(docID));

                        Document document = dataStore.getClaimFromID(Integer.parseInt(uuid));


                        String encryptedHash = document.();
                        Signature sign = new Signature();
                        boolean validation = sign.verifySignature("publicKeys\\" + "user" + userID + "PublicKey", encryptedHash, document.());

                        if (validation)
                            JOptionPane.showMessageDialog(null, docToString + "\nThis document was not tampered!\n" + "\nPress 'OK' to continue.");
                        else
                            JOptionPane.showMessageDialog(null, docToString + "\nThis document was tampered!\n" + "\nPress 'OK' to continue.");



                        //
                    }

                } catch (Exception e) {

                }
            }
        }else System.out.println("n dá");
        }

    }


