package com.gcu;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.OrdersBusinessService;
import com.gcu.data.DataAccessInterface;
import com.gcu.data.OrdersDataServiceForRepository;

@Configuration
public class SpringConfig {

	
	public SpringConfig() {
	}

	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@Scope
	OrdersBusinessInterface getOrdersBusiness() {
		return new OrdersBusinessService();
		
	}
	@Autowired
	DataSource dataSource;
	@Bean(name="service")
	@RequestScope
	public DataAccessInterface getDataService() {
		return new OrdersDataServiceForRepository(dataSource);
		
	}
}
