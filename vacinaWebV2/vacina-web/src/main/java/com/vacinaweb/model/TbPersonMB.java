package com.vacinaweb.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vacinaweb.control.PersonController;
import com.vacinaweb.entity.TbPerson;

@ManagedBean(name="personMB")
@SessionScoped
public class TbPersonMB {

	private PersonController controller;
	private TbPerson person;

	public void salvar(){
		controller.insertPerson(person);
	}

	public void deletar(){
		controller.deletePerson(person);
	}

	public void atualizar(){
		controller.updatePerson(person);
	}

}
