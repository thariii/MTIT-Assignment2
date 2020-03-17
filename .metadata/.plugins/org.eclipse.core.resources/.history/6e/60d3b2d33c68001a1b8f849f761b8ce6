package com.mtit.buyer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BuyerServiceImpl implements BuyerService{
	
	private static Map<Integer,Buyer> buyers = new HashMap<Integer,Buyer>();

	@Override
	public boolean addBuyer(Buyer b) {
		// TODO Auto-generated method stub
		if(buyers.get(b.getBuyerId()) != null) return false;
		buyers.put(b.getBuyerId(),b);
		return true;
	}

	@Override
	public boolean deleteBuyer(int buyerId) {
		// TODO Auto-generated method stub
		if(buyers.get(buyerId) == null) return false;
		buyers.remove(buyerId);
		return true;
	}

	@Override
	public Buyer getBuyer(int buyerID) {
		// TODO Auto-generated method stub
		return buyers.get(buyerID);
	}

	@Override
	public Buyer[] getAllBuyers() {
		// TODO Auto-generated method stub
		Set<Integer> ids = buyers.keySet();
		Buyer[] b = new Buyer[ids.size()];
		int i=0;
		for(Integer id : ids){
			b[i] = buyers.get(id);
			i++;
		}
		return b;
	}

}
