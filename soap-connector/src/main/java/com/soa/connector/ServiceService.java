package com.soa.connector;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-04-11T23:07:34.819+02:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "ServiceService",
                  wsdlLocation = "http://localhost:8080/Projekt1-ejb/Service?wsdl",
                  targetNamespace = "http://com.soa/")
public class ServiceService extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://com.soa/", "ServiceService");
    public final static QName ServicePort = new QName("http://com.soa/", "ServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/Projekt1-ejb/Service?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/Projekt1-ejb/Service?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Service
     */
    @WebEndpoint(name = "ServicePort")
    public Service getServicePort() {
        return super.getPort(ServicePort, Service.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Service
     */
    @WebEndpoint(name = "ServicePort")
    public Service getServicePort(WebServiceFeature... features) {
        return super.getPort(ServicePort, Service.class, features);
    }

}