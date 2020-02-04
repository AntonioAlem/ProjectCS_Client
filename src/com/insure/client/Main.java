package com.insure.client;

import com.insure.client.gen.Claim;
import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;
import com.insure.client.gen.IDNotFoundException_Exception;

import javax.swing.*;
import javax.xml.ws.BindingProvider;
import java.io.IOException;

public class Main {
    private static ClaimDataStore docStorage;

    public static void main(String[] args) throws IOException, IDNotFoundException_Exception {
        String url = "http://localhost:8090/docstorage";
        ClaimDataStoreService dss = new ClaimDataStoreService();

        ClaimDataStore dataStore = dss.getClaimDataStorePort();

        ((BindingProvider) dataStore).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

        int claimID1 = dataStore.createClaim("Vehicle Claim");
        Claim c1 = dataStore.getClaimFromID(claimID1);
        System.out.println(dataStore.printClaim(claimID1));
    }

    public static void runClaimDataStore(ClaimDataStore dataStore){
        String userId= JOptionPane.showInputDialog("Insert personal ID:");
        int user=Integer.parseInt(userId);
        while(true){
            try{
                String method=JOptionPane.showInputDialog(
                        "Insert what you wish to do:"+"\n"+
                        "1 - Create a Claim" + "\n" +
                        "2 - Add a Document to a Claim"+"\n"+
                        "3 - Retrieve Documents from a Claim"+"\n"+
                        "Exit program");
                if (method.equals("Exit program")){
                    break;
                }
                if (method.equals("1")){
                    String description=JOptionPane.showInputDialog("Insert the context of your Claim");
                    int uuid=dataStore.createClaim(description);
                    String claim= dataStore.printClaim(uuid);
                    JOptionPane.showMessageDialog(null, "Your Claim was created: "+ claim);
                }
                if (method.equals("2")){
                    String uuid=JOptionPane.showInputDialog("Insert ID of your Claim:");
                    int id=Integer.parseInt(uuid);

                    //String pathprivatekey="keys\\privateKeys\\user"+user+"\\user"+user+"PrivateKey";


                    String content=JOptionPane.showInputDialog("Insert the content of the document");
                    dataStore.createAddDocument(user, id ,content);
                    JOptionPane.showMessageDialog(null, "You added a document in your Claim");
                }

                if (method.equals("3")){
                    String uuid=JOptionPane.showInputDialog("Insert the claim identifier");
                    int id=Integer.parseInt(uuid);
                    JOptionPane.showMessageDialog(null, dataStore.retrieveDocuments(id));
                }

            } catch (Exception e){

            }
        }
    }


}


