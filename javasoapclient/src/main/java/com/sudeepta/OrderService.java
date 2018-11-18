package com.sudeepta;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.sudeepta.com.bharath.ws.trainings.CustomerOrdersPortType;
import com.sudeepta.com.bharath.ws.trainings.GetOrdersRequest;
import com.sudeepta.com.bharath.ws.trainings.GetOrdersResponse;
import com.sudeepta.com.bharath.ws.trainings.Order;
import com.sudeepta.com.sudeepta.CustomerOrderService;

public class OrderService {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		CustomerOrderService cService = new CustomerOrderService(new URL("http://localhost:8080/wsdlfirstws/customerOrderService?wsdl"));
		CustomerOrdersPortType customerOrdersPort = cService.getCustomerOrderPort();
		GetOrdersRequest request = new GetOrdersRequest();
		request.setCustomerId(BigInteger.valueOf(1));
		GetOrdersResponse response = customerOrdersPort.getOrders(request);
		List<Order> order = response.getOrder();
		
		System.out.println(" Number of orders for customers are:" +order.size() );
		
		}

}
