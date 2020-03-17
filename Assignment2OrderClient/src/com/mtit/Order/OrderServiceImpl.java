/**
 * OrderServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Order;

public interface OrderServiceImpl extends java.rmi.Remote {
    public com.mtit.Order.Order getOrder(int orderId) throws java.rmi.RemoteException;
    public boolean addOrder(com.mtit.Order.Order o) throws java.rmi.RemoteException;
    public boolean deleteOrder(int orderId) throws java.rmi.RemoteException;
    public com.mtit.Order.Order[] getAllOrders() throws java.rmi.RemoteException;
}
