package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_dependents database table.
 * 
 */
@Entity
@Table(name="tb_dependents")
@NamedQuery(name="TbDependent.findAll", query="SELECT t FROM TbDependent t")
public class TbDependent implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbDependentPK id;

	//bi-directional many-to-one association to DmDependenceType
	@ManyToOne
	@JoinColumn(name="id_dependence_type")
	private DmDependenceType dmDependenceType;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson1;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf_dependent")
	private TbPerson tbPerson2;

	public TbDependent() {
	}

	public TbDependentPK getId() {
		return this.id;
	}

	public void setId(TbDependentPK id) {
		this.id = id;
	}

	public DmDependenceType getDmDependenceType() {
		return this.dmDependenceType;
	}

	public void setDmDependenceType(DmDependenceType dmDependenceType) {
		this.dmDependenceType = dmDependenceType;
	}

	public TbPerson getTbPerson1() {
		return this.tbPerson1;
	}

	public void setTbPerson1(TbPerson tbPerson1) {
		this.tbPerson1 = tbPerson1;
	}

	public TbPerson getTbPerson2() {
		return this.tbPerson2;
	}

	public void setTbPerson2(TbPerson tbPerson2) {
		this.tbPerson2 = tbPerson2;
	}

}