package com.mtit.Seller;

public interface SellerService {

	public boolean addSeller(Seller s);
	
	public boolean deleteSeller(int sellerId);
	
	public Seller getSeller(int sellerId);
	
	public Seller[] getAllSellers();
}
