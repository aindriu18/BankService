package com.dateTimeService;


import java.io.IOException;

import com.dateTimeService.dateTimeServiceGrpc.dateTimeServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class DateTimeServer {
	
	//variable to store the server
	private Server server;

	public static void main(String[] args) {

		//instantiate the NewBankingServer
		final DateTimeServer dateTimeServer = new DateTimeServer();
		dateTimeServer.start();

	}

	private void start() {
		//output a message to show the server is started
		System.out.println("Starting the DataTime Server...");	
	
		//set the port to 51
		int port = 50051;
		
		//build and start the server
		try {
			server = ServerBuilder.forPort(port).addService(new DateTimeServerImpl()).build().start();
		} catch (IOException e) {
			System.out.println("Error starting the server");
			e.printStackTrace();
		}
		System.out.println("Server running on port "+port);
		
		try {
			server.awaitTermination();
		} catch (InterruptedException e) {
			System.out.println("Issue terminating the server");
			e.printStackTrace();
		}
	}
	
	//Extend base class for the implementation
	static class DateTimeServerImpl extends dateTimeServiceImplBase {
		
		@Override//over ride the getDateTime method to request the date and time
		public void getDateTime(containsDateTime request, StreamObserver<containsDateTime> responseObserver) {
			
			//find out what was sent by the client
			String dateTime = request.getDateTime();
					//Calendar.getInstance().getTime().toString();
			
			System.out.println("dateTime: " +dateTime);
			
			//now send something back to the client
			//build the response
			containsDateTime.Builder response = containsDateTime.newBuilder();
			
			response.setDateTime("The date and time is: " + dateTime);
			
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
			
			
		}
	}
}
