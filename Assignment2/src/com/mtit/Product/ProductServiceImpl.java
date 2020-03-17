package com.mtit.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductServiceImpl implements ProductService{
	
	private static Map<Integer,Product> products = new HashMap<Integer,Product>();

	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		if(products.get(p.getProductId()) != null) return false;
		products.put(p.getProductId(),p);
		return true;
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		if(products.get(productId)== null) return false;
		products.remove(productId);
		return true;
	}

	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return products.get(productId);
	}

	@Override
	public Product[] getAllProducts() {
		// TODO Auto-generated method stub
		Set<Integer> ids = products.keySet();
		Product[] p = new Product[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = products.get(id);
			i++;
		}
		return p;
	}

}
