package com.sudeepta;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws22.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class WebServiceConfig {
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint= new EndpointImpl(bus, new CustomerOrder());
		endpoint.publish("/customerOrderService");
		return endpoint;
		
	}
}
