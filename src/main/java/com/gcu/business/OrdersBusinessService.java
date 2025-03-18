package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class OrdersBusinessService implements OrdersBusinessInterface {

	@Autowired
	private DataAccessInterface<OrderModel> service;
	
	
	
	
	public OrdersBusinessService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void test() {
		System.out.println("Hello From the OrderBusinessService");
	}

	@Override
	public List<OrderModel> getOrders() {
		
		return service.findAll();
		
	}
	
	
    @PostConstruct
	@Override
	public void init() {
		System.out.println("Hello from the init");
		
	}
    @PreDestroy
	@Override
	public void destroy() {
	System.out.println("Hello from the destroy");
	}
	
	

}
