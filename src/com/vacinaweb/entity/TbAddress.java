package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_addresses database table.
 * 
 */
@Entity
@Table(name="tb_addresses")
@NamedQuery(name="TbAddress.findAll", query="SELECT t FROM TbAddress t")
public class TbAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbAddressPK id;

	private String address;

	private Integer number;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson;

	public TbAddress() {
	}

	public TbAddressPK getId() {
		return this.id;
	}

	public void setId(TbAddressPK id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public TbPerson getTbPerson() {
		return this.tbPerson;
	}

	public void setTbPerson(TbPerson tbPerson) {
		this.tbPerson = tbPerson;
	}

}