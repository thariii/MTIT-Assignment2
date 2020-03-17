/**
 * OrderServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Order;

public class OrderServiceImplServiceLocator extends org.apache.axis.client.Service implements com.mtit.Order.OrderServiceImplService {

    public OrderServiceImplServiceLocator() {
    }


    public OrderServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OrderServiceImpl
    private java.lang.String OrderServiceImpl_address = "http://localhost:8080/Assignment2/services/OrderServiceImpl";

    public java.lang.String getOrderServiceImplAddress() {
        return OrderServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OrderServiceImplWSDDServiceName = "OrderServiceImpl";

    public java.lang.String getOrderServiceImplWSDDServiceName() {
        return OrderServiceImplWSDDServiceName;
    }

    public void setOrderServiceImplWSDDServiceName(java.lang.String name) {
        OrderServiceImplWSDDServiceName = name;
    }

    public com.mtit.Order.OrderServiceImpl getOrderServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OrderServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOrderServiceImpl(endpoint);
    }

    public com.mtit.Order.OrderServiceImpl getOrderServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mtit.Order.OrderServiceImplSoapBindingStub _stub = new com.mtit.Order.OrderServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getOrderServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOrderServiceImplEndpointAddress(java.lang.String address) {
        OrderServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mtit.Order.OrderServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mtit.Order.OrderServiceImplSoapBindingStub _stub = new com.mtit.Order.OrderServiceImplSoapBindingStub(new java.net.URL(OrderServiceImpl_address), this);
                _stub.setPortName(getOrderServiceImplWSDDServiceName());
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
        if ("OrderServiceImpl".equals(inputPortName)) {
            return getOrderServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Order.mtit.com", "OrderServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Order.mtit.com", "OrderServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OrderServiceImpl".equals(portName)) {
            setOrderServiceImplEndpointAddress(address);
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
