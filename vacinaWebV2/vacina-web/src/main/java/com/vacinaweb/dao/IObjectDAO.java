package com.vacinaweb.dao;

import java.util.List;

public interface IObjectDAO {

	public void insert(Object o);
	public List<Object> selectAll();
	public void update(Object o);
	public void delete(Object o);

}
