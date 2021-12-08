package com.transactionService;


import java.io.IOException;

import com.transactionService.transactionServiceGrpc.transactionServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class TransactionServer {
	
	//variable to store the server
	private Server server;

	public static void main(String[] args) {

		//instantiate the NewBankingServer
		final TransactionServer transactionServer = new TransactionServer();
		transactionServer.start();

	}

	private void start() {
		//output a message to show the server is started
		System.out.println("Starting the Transaction Server...");	
	
		//set the port to 54
		int port = 50054;
		
		//build and start the server
		try {
			server = ServerBuilder.forPort(port).addService(new TransactionServerImpl()).build().start();
		} catch (IOException e) {
			System.out.println("Error starting the Transaction server");
			e.printStackTrace();
		}
		System.out.println("Transaction Server running on port "+port);
		
		try {
			server.awaitTermination();
		} catch (InterruptedException e) {
			System.out.println("Issue terminating the Transaction server");
			e.printStackTrace();
		}
	}
	
	//Extend base class for the implementation
	static class TransactionServerImpl extends transactionServiceImplBase {
		
		@Override//over ride the getLocation method to request the location
		public void getTransaction(containsTransaction request, StreamObserver<containsTransaction> responseObserver) {
			
			//find out what was sent by the client
			String transaction = request.getTransaction();
					//Calendar.getInstance().getTime().toString();
			
			System.out.println("Transaction: " +transaction);
			
			//now send something back to the client
			//build the response
			containsTransaction.Builder response = containsTransaction.newBuilder();
			
			response.setTransaction("Transaction 1 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 2 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 3 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 4 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 5 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 6 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 7 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 8 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 9 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			response.setTransaction("Transaction 10 is: " + transaction);
			
			responseObserver.onNext(response.build());
			
			
			
			responseObserver.onCompleted();
		}
	}
}
