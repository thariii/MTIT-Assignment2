/**
 * SellerServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Seller;

public interface SellerServiceImpl extends java.rmi.Remote {
    public boolean deleteSeller(int sellerId) throws java.rmi.RemoteException;
    public com.mtit.Seller.Seller getSeller(int sellerId) throws java.rmi.RemoteException;
    public com.mtit.Seller.Seller[] getAllSellers() throws java.rmi.RemoteException;
    public boolean addSeller(com.mtit.Seller.Seller s) throws java.rmi.RemoteException;
}
