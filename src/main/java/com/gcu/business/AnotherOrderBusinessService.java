/**
 * 
 */
package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

/**
 * 
 */
 
public class AnotherOrderBusinessService implements OrdersBusinessInterface {

	/**
	 * 
	 */
	public AnotherOrderBusinessService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void test() {
		System.out.println("Hello from AnotherOrderBusinessService");

	}

	@Override
	public List<OrderModel> getOrders() {
		//Hard CodeList
		List<OrderModel> anotherorder = new ArrayList<>();
		anotherorder.add(new OrderModel(1L, "Order #2", "SCREWS", 9, 6));
				return anotherorder;
	}

	@Override
	public void init() {
		System.out.println("Hello from the init");
		
	}

	@Override
	public void destroy() {
		System.out.println("Hello from the destroy");
		
	}

}
