package com.mtit.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class OrderServiceImpl implements OrderService{
	
	private static Map<Integer,Order> orders = new HashMap<Integer,Order>();

	@Override
	public boolean addOrder(Order o) {
		// TODO Auto-generated method stub
		if(orders.get(o.getOrderId()) != null) return false;
		orders.put(o.getOrderId(),o);
		return true;
	}

	@Override
	public boolean deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		if(orders.get(orderId)== null) return false;
		orders.remove(orderId);
		return true;
	}

	@Override
	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return orders.get(orderId);
	}

	@Override
	public Order[] getAllOrders() {
		// TODO Auto-generated method stub
		Set<Integer> ids = orders.keySet();
		Order[] o = new Order[ids.size()];
		int i=0;
		for(Integer id : ids){
			o[i] = orders.get(id);
			i++;
		}
		return o;
	}

}
