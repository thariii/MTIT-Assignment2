package com.mtit.Order;


public interface OrderService {
	

	public boolean addOrder(Order o);
	
	public boolean deleteOrder(int orderId);
	
	public Order getOrder(int orderId);
	
	public Order[] getAllOrders();

}
