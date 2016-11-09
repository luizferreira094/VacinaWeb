package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_emails database table.
 * 
 */
@Entity
@Table(name="tb_emails")
@NamedQuery(name="TbEmail.findAll", query="SELECT t FROM TbEmail t")
public class TbEmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbEmailPK id;

	private String email;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson;

	public TbEmail() {
	}

	public TbEmailPK getId() {
		return this.id;
	}

	public void setId(TbEmailPK id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TbPerson getTbPerson() {
		return this.tbPerson;
	}

	public void setTbPerson(TbPerson tbPerson) {
		this.tbPerson = tbPerson;
	}

}