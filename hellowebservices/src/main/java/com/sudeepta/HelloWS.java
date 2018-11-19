package com.sudeepta;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWS {
	@WebMethod
	public String hello() {
		return "Hello";
	}

}
