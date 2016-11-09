package com.vacinaweb.control;

import com.vacinaweb.dao.IObjectDAO;
import com.vacinaweb.dao.impl.PersonDAOImpl;
import com.vacinaweb.entity.TbPerson;

public class PersonController {

	IObjectDAO dao = new PersonDAOImpl();

	public Boolean insertPerson(TbPerson person){
		try{
			dao.insert(person);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void deletePerson(TbPerson person){
		dao.delete(person);
	}

	public void updatePerson(TbPerson person){
		dao.update(person);
	}

}
