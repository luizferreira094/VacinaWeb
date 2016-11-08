package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_access database table.
 * 
 */
@Entity
@Table(name="tb_access")
@NamedQuery(name="TbAccess.findAll", query="SELECT t FROM TbAccess t")
public class TbAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long cpf;

	private String login;

	private String password;

	//bi-directional one-to-one association to TbPerson
	@OneToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson;

	public TbAccess() {
	}

	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TbPerson getTbPerson() {
		return this.tbPerson;
	}

	public void setTbPerson(TbPerson tbPerson) {
		this.tbPerson = tbPerson;
	}

}