package com.mtit.buyer;

public interface BuyerService {
	
	public boolean addBuyer(Buyer p);
	
	public boolean deleteBuyer(int buyerId);
	
	public Buyer getBuyer(int buyerID);
	
	public Buyer[] getAllBuyers();

}
