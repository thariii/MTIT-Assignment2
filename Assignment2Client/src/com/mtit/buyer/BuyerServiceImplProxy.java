package com.mtit.buyer;

public class BuyerServiceImplProxy implements com.mtit.buyer.BuyerServiceImpl {
  private String _endpoint = null;
  private com.mtit.buyer.BuyerServiceImpl buyerServiceImpl = null;
  
  public BuyerServiceImplProxy() {
    _initBuyerServiceImplProxy();
  }
  
  public BuyerServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuyerServiceImplProxy();
  }
  
  private void _initBuyerServiceImplProxy() {
    try {
      buyerServiceImpl = (new com.mtit.buyer.BuyerServiceImplServiceLocator()).getBuyerServiceImpl();
      if (buyerServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buyerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buyerServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buyerServiceImpl != null)
      ((javax.xml.rpc.Stub)buyerServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mtit.buyer.BuyerServiceImpl getBuyerServiceImpl() {
    if (buyerServiceImpl == null)
      _initBuyerServiceImplProxy();
    return buyerServiceImpl;
  }
  
  public com.mtit.buyer.Buyer getBuyer(int buyerID) throws java.rmi.RemoteException{
    if (buyerServiceImpl == null)
      _initBuyerServiceImplProxy();
    return buyerServiceImpl.getBuyer(buyerID);
  }
  
  public boolean deleteBuyer(int buyerId) throws java.rmi.RemoteException{
    if (buyerServiceImpl == null)
      _initBuyerServiceImplProxy();
    return buyerServiceImpl.deleteBuyer(buyerId);
  }
  
  public boolean addBuyer(com.mtit.buyer.Buyer b) throws java.rmi.RemoteException{
    if (buyerServiceImpl == null)
      _initBuyerServiceImplProxy();
    return buyerServiceImpl.addBuyer(b);
  }
  
  public com.mtit.buyer.Buyer[] getAllBuyers() throws java.rmi.RemoteException{
    if (buyerServiceImpl == null)
      _initBuyerServiceImplProxy();
    return buyerServiceImpl.getAllBuyers();
  }
  
  
}