package com.sudeepta.com.sudeepta;
import com.sudeepta.com.bharath.ws.trainings.*;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.sudeepta.com.bharath.ws.trainings.CustomerOrdersPortType;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-11-17T19:45:49.627-06:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "CustomerOrderService", 
                  wsdlLocation = "classpath:Customer.wsdl",
                  targetNamespace = "http://sudeepta.com/") 
public class CustomerOrderService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sudeepta.com/", "CustomerOrderService");
    public final static QName CustomerOrderPort = new QName("http://sudeepta.com/", "CustomerOrderPort");
    static {
        URL url = CustomerOrderService.class.getClassLoader().getResource("Customer.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CustomerOrderService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:Customer.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public CustomerOrderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerOrderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerOrderService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CustomerOrderService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerOrderService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerOrderService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CustomerOrdersPortType
     */
    @WebEndpoint(name = "CustomerOrderPort")
    public CustomerOrdersPortType getCustomerOrderPort() {
        return super.getPort(CustomerOrderPort, CustomerOrdersPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerOrdersPortType
     */
    @WebEndpoint(name = "CustomerOrderPort")
    public CustomerOrdersPortType getCustomerOrderPort(WebServiceFeature... features) {
        return super.getPort(CustomerOrderPort, CustomerOrdersPortType.class, features);
    }

}
