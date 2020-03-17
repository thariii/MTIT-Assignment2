/**
 * SellerServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Seller;

public class SellerServiceImplServiceLocator extends org.apache.axis.client.Service implements com.mtit.Seller.SellerServiceImplService {

    public SellerServiceImplServiceLocator() {
    }


    public SellerServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SellerServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SellerServiceImpl
    private java.lang.String SellerServiceImpl_address = "http://localhost:8080/Assignment2/services/SellerServiceImpl";

    public java.lang.String getSellerServiceImplAddress() {
        return SellerServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SellerServiceImplWSDDServiceName = "SellerServiceImpl";

    public java.lang.String getSellerServiceImplWSDDServiceName() {
        return SellerServiceImplWSDDServiceName;
    }

    public void setSellerServiceImplWSDDServiceName(java.lang.String name) {
        SellerServiceImplWSDDServiceName = name;
    }

    public com.mtit.Seller.SellerServiceImpl getSellerServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SellerServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSellerServiceImpl(endpoint);
    }

    public com.mtit.Seller.SellerServiceImpl getSellerServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mtit.Seller.SellerServiceImplSoapBindingStub _stub = new com.mtit.Seller.SellerServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getSellerServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSellerServiceImplEndpointAddress(java.lang.String address) {
        SellerServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mtit.Seller.SellerServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mtit.Seller.SellerServiceImplSoapBindingStub _stub = new com.mtit.Seller.SellerServiceImplSoapBindingStub(new java.net.URL(SellerServiceImpl_address), this);
                _stub.setPortName(getSellerServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SellerServiceImpl".equals(inputPortName)) {
            return getSellerServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Seller.mtit.com", "SellerServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Seller.mtit.com", "SellerServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SellerServiceImpl".equals(portName)) {
            setSellerServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
