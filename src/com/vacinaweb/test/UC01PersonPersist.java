package com.vacinaweb.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.vacinaweb.control.PersonController;
import com.vacinaweb.entity.TbAddress;
import com.vacinaweb.entity.TbEmail;
import com.vacinaweb.entity.TbPerson;
import com.vacinaweb.entity.TbPhone;

public class UC01PersonPersist {

	private static TbPerson person;
	private static TbAddress address;
	private static TbPhone phone;
	private static TbEmail email;
	private static PersonController controller;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		controller = new PersonController();
		
		person = new TbPerson();
		address = new TbAddress();
		phone = new TbPhone();
		email = new TbEmail();
		
		List<TbAddress> addresses = new ArrayList<TbAddress>();
		List<TbPhone> phones = new ArrayList<TbPhone>();
		List<TbEmail> emails = new ArrayList<TbEmail>();
		
		address.setAddress("Rua Canapi");
		address.setNumber(168);
		addresses.add(address);
		
		phone.setPhoneNumber(995739852L);
		phones.add(phone);
		
		email.setEmail("luiz.ferreira094@gmail.com");
		emails.add(email);
		
		person.setCpf(44545218830L);
		person.setName("Luizao");
		person.setDtBirth(Calendar.getInstance().getTime());
		person.setRg("369945001");
		person.setWeight(100);
		person.setHasTattoo(false);
		person.setTbAddresses(addresses);
		person.setTbPhones(phones);
		person.setTbEmails(emails);
		
	}

	@Test
	public void test() {
		assertTrue(controller.insertPerson(person));
	}

}
