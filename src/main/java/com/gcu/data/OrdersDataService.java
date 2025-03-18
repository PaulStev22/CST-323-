package com.gcu.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;
import com.gcu.model.OrderModel;
import com.gcu.model.OrdersMapper;

import javax.sql.DataSource;

@Service
public class OrdersDataService implements DataAccessInterface<OrderModel> {

	
	@Autowired
	private DataSource dataSource;
	@Autowired
    private JdbcTemplate jdbcTemplate;

    public OrdersDataService(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        
        
    }
    

    // Other methods and functionality of the OrdersDataService class

    // Getter and setter methods for dataSource and jdbcTemplateObject

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate getJdbcTemplateObject() {
        return jdbcTemplate;
    }

    public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
        this.jdbcTemplate = jdbcTemplateObject;
    }

	/*@Override
	public List<OrderModel> findAll() 
	{
		String sql = "SELECT * FROM ORDERS";
		List<OrderModel> orders = new ArrayList<OrderModel>();
		try {
			
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while(srs.next()) 
			{
				 orders.add(new OrderModel(srs.getLong("ID"),srs.getString("ORDER_NO"), srs.getString("PRODUCT_NAME"),srs.getFloat("PRICE"),srs.getInt("QUANTITY")));
	                        
	                        
				
			
		
			
		}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return orders;
		
	}/*/
		
		public List<OrderModel> findAll(){
			List<OrderModel> results= jdbcTemplate.query("SELECT * FROM ORDERS", new OrdersMapper());
			
			
			return results;
			
		}
	

	@Override
	public OrderModel findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long create(OrderModel order) {
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?, ?, ?, ?)";
		try {
			
			//Execute SQL Insert
			int rows = jdbcTemplate.update(sql,order.getOrderNo(),order.getProductName(),order.getPrice(),order.getQuantity());
			
			//return result of insert
			//return rows == 1 ? true : false;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return 0;
	}

	



	


	@Override
	public OrderModel update(long idtoUpdate, OrderModel updateOrder) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}
}

	


