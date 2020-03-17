/**
 * OrderServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Order;

public interface OrderServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getOrderServiceImplAddress();

    public com.mtit.Order.OrderServiceImpl getOrderServiceImpl() throws javax.xml.rpc.ServiceException;

    public com.mtit.Order.OrderServiceImpl getOrderServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
