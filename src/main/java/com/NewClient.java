package com;
import com.balanceService.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class NewClient {

    public static void main(String[] args) throws InterruptedException {

        //build a channel - we need 2 variables
        int port = 50053;
        //int portLocation = 50052;
        String host = "localhost";

        //plaintext not secure if using production service
        //this is generic code
        ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

        //build a message - from client to the server
        containsBalance containsBalanceString = containsBalance.newBuilder().setBalance("€100,000").build();
        //containsLocation containsLocationString = containsLocation.newBuilder().setLocation("Dundalk").build();

        //create a stub - it is a local representation of the particular service
        balanceServiceGrpc.balanceServiceBlockingStub   bStub = balanceServiceGrpc.newBlockingStub(newChannel);
        //locationServiceGrpc.locationServiceBlockingStub bStubLocation = locationServiceGrpc.newBlockingStub(newChannel);

        //contains a string inside it
        containsBalance  response = bStub.getBalance(containsBalanceString);
        //containsLocation responseLocation = bStubLocation.getLocation(containsLocationString);

        //unary call completed
        System.out.println(response.getBalance());
        //System.out.println(responseLocation.getLocation());

        try {
            newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.out.println("Error closing down channel");
            e.printStackTrace();
        }

    }
}
