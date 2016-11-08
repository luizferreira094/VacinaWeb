package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_phones database table.
 * 
 */
@Entity
@Table(name="tb_phones")
@NamedQuery(name="TbPhone.findAll", query="SELECT t FROM TbPhone t")
public class TbPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbPhonePK id;

	@Column(name="phone_number")
	private Long phoneNumber;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson;

	public TbPhone() {
	}

	public TbPhonePK getId() {
		return this.id;
	}

	public void setId(TbPhonePK id) {
		this.id = id;
	}

	public Long getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public TbPerson getTbPerson() {
		return this.tbPerson;
	}

	public void setTbPerson(TbPerson tbPerson) {
		this.tbPerson = tbPerson;
	}

}