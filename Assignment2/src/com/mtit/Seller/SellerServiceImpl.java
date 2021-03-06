package com.mtit.Seller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class SellerServiceImpl implements SellerService{
	
	private static Map<Integer,Seller> sellers = new HashMap<Integer,Seller>();

	@Override
	public boolean addSeller(Seller s) {
		// TODO Auto-generated method stub
		if(sellers.get(s.getSellerId()) != null) return false;
		sellers.put(s.getSellerId(),s);
		return true;
	}

	@Override
	public boolean deleteSeller(int sellerId) {
		// TODO Auto-generated method stub
		if(sellers.get(sellerId)== null) return false;
		sellers.remove(sellerId);
		return true;
		
	}

	@Override
	public Seller getSeller(int sellerId) {
		// TODO Auto-generated method stub
		return sellers.get(sellerId);
	}

	@Override
	public Seller[] getAllSellers() {
		// TODO Auto-generated method stub
		Set<Integer> ids = sellers.keySet();
		Seller[] s = new Seller[ids.size()];
		int i=0;
		for(Integer id : ids){
			s[i] = sellers.get(id);
			i++;
		}
		return s;
	}

}
