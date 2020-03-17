/**
 * BuyerServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.buyer;

public class BuyerServiceImplServiceLocator extends org.apache.axis.client.Service implements com.mtit.buyer.BuyerServiceImplService {

    public BuyerServiceImplServiceLocator() {
    }


    public BuyerServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BuyerServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BuyerServiceImpl
    private java.lang.String BuyerServiceImpl_address = "http://localhost:8080/Assignment2/services/BuyerServiceImpl";

    public java.lang.String getBuyerServiceImplAddress() {
        return BuyerServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BuyerServiceImplWSDDServiceName = "BuyerServiceImpl";

    public java.lang.String getBuyerServiceImplWSDDServiceName() {
        return BuyerServiceImplWSDDServiceName;
    }

    public void setBuyerServiceImplWSDDServiceName(java.lang.String name) {
        BuyerServiceImplWSDDServiceName = name;
    }

    public com.mtit.buyer.BuyerServiceImpl getBuyerServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BuyerServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBuyerServiceImpl(endpoint);
    }

    public com.mtit.buyer.BuyerServiceImpl getBuyerServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mtit.buyer.BuyerServiceImplSoapBindingStub _stub = new com.mtit.buyer.BuyerServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getBuyerServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBuyerServiceImplEndpointAddress(java.lang.String address) {
        BuyerServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mtit.buyer.BuyerServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mtit.buyer.BuyerServiceImplSoapBindingStub _stub = new com.mtit.buyer.BuyerServiceImplSoapBindingStub(new java.net.URL(BuyerServiceImpl_address), this);
                _stub.setPortName(getBuyerServiceImplWSDDServiceName());
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
        if ("BuyerServiceImpl".equals(inputPortName)) {
            return getBuyerServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://buyer.mtit.com", "BuyerServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://buyer.mtit.com", "BuyerServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BuyerServiceImpl".equals(portName)) {
            setBuyerServiceImplEndpointAddress(address);
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
