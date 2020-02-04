package com.insure.client;

import com.insure.client.gen.Claim;
import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;
import com.insure.client.gen.IDNotFoundException_Exception;

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
    }
}