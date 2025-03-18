package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcu.model.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersDataServiceForRepository implements DataAccessInterface<OrderModel> {

	
	//need a data service
	OrdersRepositoryInterface ordersRepository;
	
	private JdbcTemplate jdbcTemplate;
	
	public OrdersDataServiceForRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	@Override
	public List<OrderModel> findAll() {
		
		Iterable<OrderEntity> ordersEntity = ordersRepository.findAll();
		
		List<OrderModel> models = new ArrayList<OrderModel>();
		for(OrderEntity item: ordersEntity) {
			models.add(modelMapper.map(item, OrderModel.class));		
			}
		return models;
	}

	ModelMapper modelMapper = new ModelMapper();
	@Override
	public OrderModel findById(long id) {
		OrderEntity entity = ordersRepository.findById(id).orElse(null);
		
		/*OrderModel model = new OrderModel(id, 
				entity.getOrderNo(), 
				entity.getProductName(), 
				entity.getPrice(),
				entity.getQuantity()
				);
		
		
		*/
		OrderModel model = modelMapper.map(entity, OrderModel.class);
		return model;
	}

	@Override
	public long create(OrderModel newOrder) {
		OrderEntity entity = modelMapper.map(newOrder, OrderEntity.class);
		OrderEntity result = ordersRepository.save(entity);
		if(result == null) {
			return 0;
		}
		else {
			return result.getId();
		}
		
		
	}

	@Override
	public OrderModel update(long idtoUpdate, OrderModel updateOrder) {
		OrderEntity entity = modelMapper.map(updateOrder, OrderEntity.class);
		OrderEntity result = ordersRepository.save(entity);
		OrderModel order = modelMapper.map(result, OrderModel.class);
		return order;
	}

	@Override
	public boolean delete(long id) {
		ordersRepository.deleteById(id);
		return true;
	}

}
