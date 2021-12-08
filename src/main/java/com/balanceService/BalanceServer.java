package com.balanceService;


import java.io.IOException;

import com.balanceService.balanceServiceGrpc.balanceServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class BalanceServer {
	
	//variable to store the server
	private Server server;

	public static void main(String[] args) {

		//instantiate the NewBankingServer
		final BalanceServer balanceServer = new BalanceServer();
		balanceServer.start();

	}

	private void start() {
		//output a message to show the server is started
		System.out.println("Starting the balance Server...");	
	
		//set the port to 53
		int port = 50053;
		
		//build and start the server
		try {
			server = ServerBuilder.forPort(port).addService(new BalanceServerImpl()).build().start();
		} catch (IOException e) {
			System.out.println("Error starting the balanceServer server");
			e.printStackTrace();
		}
		System.out.println("Balance Server running on port "+port);
		
		try {
			server.awaitTermination();
		} catch (InterruptedException e) {
			System.out.println("Issue terminating the balance server");
			e.printStackTrace();
		}
	}
	
	//Extend base class for the implementation
	static class BalanceServerImpl extends balanceServiceImplBase {
		
		@Override//over ride the getLocation method to request the location
		public void getBalance(containsBalance request, StreamObserver<containsBalance> responseObserver) {
			
			//find out what was sent by the client
			String balance = request.getBalance();
					//Calendar.getInstance().getTime().toString();
			
			System.out.println("Balance: " +balance);
			
			//now send something back to the client
			//build the response
			containsBalance.Builder response = containsBalance.newBuilder();
			
			response.setBalance("Balance is: " + balance);
			
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
	}
}
