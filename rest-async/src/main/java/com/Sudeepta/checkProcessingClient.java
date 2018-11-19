package com.Sudeepta;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class checkProcessingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client newClient = ClientBuilder.newClient();
		WebTarget target = newClient.target("http://localhost:8080/restasync/services/checkprocessingservice/checks");
		AsyncInvoker invoker = target.request().async();
		Future<Boolean> response = invoker.post(Entity.entity(new Checklist(), MediaType.APPLICATION_XML), Boolean.class);
		try {
			System.out.println(response.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		

	}

}
