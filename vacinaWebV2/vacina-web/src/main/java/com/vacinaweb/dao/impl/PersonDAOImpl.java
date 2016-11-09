package com.vacinaweb.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.vacinaweb.dao.IObjectDAO;
import com.vacinaweb.entity.TbPerson;

@PersistenceUnit(name="vacinaWeb")
public class PersonDAOImpl implements IObjectDAO {

	private EntityManager manager;

	public PersonDAOImpl() {
		EntityManagerFactory emf = null;
		manager = emf.createEntityManager();
		emf.close();
	}

	public void insert(Object o) {
		try{
			manager.getTransaction().begin();
			manager.persist((TbPerson) o);
			manager.getTransaction().commit();
		}catch (Exception e) {
			manager.getTransaction().rollback();
		}finally {
			manager.close();
		}
	}

	public List<Object> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Object o) {
		try{
			manager.getTransaction().begin();
			manager.merge((TbPerson) o);
			manager.getTransaction().commit();
		}catch (Exception e) {
			manager.getTransaction().rollback();
		}finally {
			manager.close();
		}

	}

	public void delete(Object o) {
		try{
			manager.getTransaction().begin();
			manager.remove((TbPerson) o);
			manager.getTransaction().commit();
		}catch (Exception e) {
			manager.getTransaction().rollback();
		}finally {
			manager.close();
		}

	}


}

