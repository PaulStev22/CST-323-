package com.gcu.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OrdersMapper implements RowMapper<OrderModel> {

	public OrdersMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public OrderModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		OrderModel order = new OrderModel(rs.getLong("ID"), rs.getString("ORDER_NUMBER"), rs.getString("PRODUCT_NAME"), rs.getFloat("PRICE"), rs.getInt("QTY"));
		return order;
	}

}
