package com.mtit.Product;

public class ProductServiceImplProxy implements com.mtit.Product.ProductServiceImpl {
  private String _endpoint = null;
  private com.mtit.Product.ProductServiceImpl productServiceImpl = null;
  
  public ProductServiceImplProxy() {
    _initProductServiceImplProxy();
  }
  
  public ProductServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductServiceImplProxy();
  }
  
  private void _initProductServiceImplProxy() {
    try {
      productServiceImpl = (new com.mtit.Product.ProductServiceImplServiceLocator()).getProductServiceImpl();
      if (productServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productServiceImpl != null)
      ((javax.xml.rpc.Stub)productServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mtit.Product.ProductServiceImpl getProductServiceImpl() {
    if (productServiceImpl == null)
      _initProductServiceImplProxy();
    return productServiceImpl;
  }
  
  public com.mtit.Product.Product getProduct(int productId) throws java.rmi.RemoteException{
    if (productServiceImpl == null)
      _initProductServiceImplProxy();
    return productServiceImpl.getProduct(productId);
  }
  
  public boolean addProduct(com.mtit.Product.Product p) throws java.rmi.RemoteException{
    if (productServiceImpl == null)
      _initProductServiceImplProxy();
    return productServiceImpl.addProduct(p);
  }
  
  public com.mtit.Product.Product[] getAllProducts() throws java.rmi.RemoteException{
    if (productServiceImpl == null)
      _initProductServiceImplProxy();
    return productServiceImpl.getAllProducts();
  }
  
  public boolean deleteProduct(int productId) throws java.rmi.RemoteException{
    if (productServiceImpl == null)
      _initProductServiceImplProxy();
    return productServiceImpl.deleteProduct(productId);
  }
  
  
}