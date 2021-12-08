package com.locationService;


import java.io.IOException;

import com.locationService.locationServiceGrpc.locationServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class LocationServer {
	
	//variable to store the server
	private Server server;

	public static void main(String[] args) {

		//instantiate the NewBankingServer
		final LocationServer locationServer = new LocationServer();
		locationServer.start();

	}

	private void start() {
		//output a message to show the server is started
		System.out.println("Starting the Location Server...");	
	
		//set the port to 52
		int portLocation = 50052;
		
		//build and start the server
		try {
			server = ServerBuilder.forPort(portLocation).addService(new LocationServerImpl()).build().start();
		} catch (IOException e) {
			System.out.println("Error starting the locationServer server");
			e.printStackTrace();
		}
		System.out.println("Location Server running on port "+portLocation);
		
		try {
			server.awaitTermination();
		} catch (InterruptedException e) {
			System.out.println("Issue terminating the location server");
			e.printStackTrace();
		}
	}
	
	//Extend base class for the implementation
	static class LocationServerImpl extends locationServiceImplBase {
		
		@Override//over ride the getLocation method to request the location
		public void getLocation(containsLocation request, StreamObserver<containsLocation> responseObserver) {
			
			//find out what was sent by the client
			String location = request.getLocation();
					//Calendar.getInstance().getTime().toString();
			
			System.out.println("Location: " +location);
			
			//now send something back to the client
			//build the response
			containsLocation.Builder response = containsLocation.newBuilder();
			
			response.setLocation("Location is: " + location);
			
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
			
			
		}
	}
}
