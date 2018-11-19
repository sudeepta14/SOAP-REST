package com.sudeepta.com.bharath.ws.trainings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-11-17T19:45:49.594-06:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://trainings.ws.bharath.com/", name = "CustomerOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerOrdersPortType {

    @WebMethod
    @WebResult(name = "createOrdersResponse", targetNamespace = "http://trainings.ws.bharath.com/", partName = "parameters")
    public CreateOrdersResponse createOrders(
        @WebParam(partName = "parameters", name = "createOrdersRequest", targetNamespace = "http://trainings.ws.bharath.com/")
        CreateOrdersRequest parameters
    );

    @WebMethod
    @WebResult(name = "getOrdersResponse", targetNamespace = "http://trainings.ws.bharath.com/", partName = "parameters")
    public GetOrdersResponse getOrders(
        @WebParam(partName = "parameters", name = "getOrdersRequest", targetNamespace = "http://trainings.ws.bharath.com/")
        GetOrdersRequest parameters
    );
}
