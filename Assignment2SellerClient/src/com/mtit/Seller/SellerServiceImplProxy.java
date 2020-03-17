package com.mtit.Seller;

public class SellerServiceImplProxy implements com.mtit.Seller.SellerServiceImpl {
  private String _endpoint = null;
  private com.mtit.Seller.SellerServiceImpl sellerServiceImpl = null;
  
  public SellerServiceImplProxy() {
    _initSellerServiceImplProxy();
  }
  
  public SellerServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initSellerServiceImplProxy();
  }
  
  private void _initSellerServiceImplProxy() {
    try {
      sellerServiceImpl = (new com.mtit.Seller.SellerServiceImplServiceLocator()).getSellerServiceImpl();
      if (sellerServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sellerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sellerServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sellerServiceImpl != null)
      ((javax.xml.rpc.Stub)sellerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mtit.Seller.SellerServiceImpl getSellerServiceImpl() {
    if (sellerServiceImpl == null)
      _initSellerServiceImplProxy();
    return sellerServiceImpl;
  }
  
  public boolean addSeller(com.mtit.Seller.Seller s) throws java.rmi.RemoteException{
    if (sellerServiceImpl == null)
      _initSellerServiceImplProxy();
    return sellerServiceImpl.addSeller(s);
  }
  
  public boolean deleteSeller(int sellerId) throws java.rmi.RemoteException{
    if (sellerServiceImpl == null)
      _initSellerServiceImplProxy();
    return sellerServiceImpl.deleteSeller(sellerId);
  }
  
  public com.mtit.Seller.Seller[] getAllSellers() throws java.rmi.RemoteException{
    if (sellerServiceImpl == null)
      _initSellerServiceImplProxy();
    return sellerServiceImpl.getAllSellers();
  }
  
  public com.mtit.Seller.Seller getSeller(int sellerId) throws java.rmi.RemoteException{
    if (sellerServiceImpl == null)
      _initSellerServiceImplProxy();
    return sellerServiceImpl.getSeller(sellerId);
  }
  
  
}