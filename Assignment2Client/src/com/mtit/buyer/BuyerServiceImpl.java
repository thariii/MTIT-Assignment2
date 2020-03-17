/**
 * BuyerServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.buyer;

public interface BuyerServiceImpl extends java.rmi.Remote {
    public com.mtit.buyer.Buyer getBuyer(int buyerID) throws java.rmi.RemoteException;
    public boolean deleteBuyer(int buyerId) throws java.rmi.RemoteException;
    public boolean addBuyer(com.mtit.buyer.Buyer b) throws java.rmi.RemoteException;
    public com.mtit.buyer.Buyer[] getAllBuyers() throws java.rmi.RemoteException;
}
