/**
 * ProductServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Product;

public interface ProductServiceImpl extends java.rmi.Remote {
    public com.mtit.Product.Product getProduct(int productId) throws java.rmi.RemoteException;
    public boolean deleteProduct(int productId) throws java.rmi.RemoteException;
    public boolean addProduct(com.mtit.Product.Product p) throws java.rmi.RemoteException;
    public com.mtit.Product.Product[] getAllProducts() throws java.rmi.RemoteException;
}
