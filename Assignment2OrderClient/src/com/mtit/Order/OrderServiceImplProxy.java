package com.mtit.Order;

public class OrderServiceImplProxy implements com.mtit.Order.OrderServiceImpl {
  private String _endpoint = null;
  private com.mtit.Order.OrderServiceImpl orderServiceImpl = null;
  
  public OrderServiceImplProxy() {
    _initOrderServiceImplProxy();
  }
  
  public OrderServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initOrderServiceImplProxy();
  }
  
  private void _initOrderServiceImplProxy() {
    try {
      orderServiceImpl = (new com.mtit.Order.OrderServiceImplServiceLocator()).getOrderServiceImpl();
      if (orderServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)orderServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)orderServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (orderServiceImpl != null)
      ((javax.xml.rpc.Stub)orderServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mtit.Order.OrderServiceImpl getOrderServiceImpl() {
    if (orderServiceImpl == null)
      _initOrderServiceImplProxy();
    return orderServiceImpl;
  }
  
  public com.mtit.Order.Order getOrder(int orderId) throws java.rmi.RemoteException{
    if (orderServiceImpl == null)
      _initOrderServiceImplProxy();
    return orderServiceImpl.getOrder(orderId);
  }
  
  public boolean addOrder(com.mtit.Order.Order o) throws java.rmi.RemoteException{
    if (orderServiceImpl == null)
      _initOrderServiceImplProxy();
    return orderServiceImpl.addOrder(o);
  }
  
  public boolean deleteOrder(int orderId) throws java.rmi.RemoteException{
    if (orderServiceImpl == null)
      _initOrderServiceImplProxy();
    return orderServiceImpl.deleteOrder(orderId);
  }
  
  public com.mtit.Order.Order[] getAllOrders() throws java.rmi.RemoteException{
    if (orderServiceImpl == null)
      _initOrderServiceImplProxy();
    return orderServiceImpl.getAllOrders();
  }
  
  
}