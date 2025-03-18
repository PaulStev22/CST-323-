package com.gcu.data;

import java.util.List;

public interface DataAccessInterface <T>{
	
	public List<T> findAll();
	public T findById(long id);
	public long create(T newOrder);
	public T update(long idtoUpdate, T updateOrder);
	public boolean delete(long id);
	

}
