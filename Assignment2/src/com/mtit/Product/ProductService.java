package com.mtit.Product;


public interface ProductService {
	
	public boolean addProduct(Product p);
	
	public boolean deleteProduct(int productId);
	
	public Product getProduct(int productId);
	
	public Product[] getAllProducts();

}
