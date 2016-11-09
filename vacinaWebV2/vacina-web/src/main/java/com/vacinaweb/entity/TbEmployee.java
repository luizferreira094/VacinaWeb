package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tb_employees database table.
 * 
 */
@Entity
@Table(name="tb_employees")
@NamedQuery(name="TbEmployee.findAll", query="SELECT t FROM TbEmployee t")
public class TbEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbEmployeePK id;

	//bi-directional many-to-one association to DmLocal
	@ManyToOne
	@JoinColumn(name="id_local")
	private DmLocal dmLocal;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson;

	//bi-directional many-to-one association to TbVaccination
	@OneToMany(mappedBy="tbEmployee")
	private List<TbVaccination> tbVaccinations;

	public TbEmployee() {
	}

	public TbEmployeePK getId() {
		return this.id;
	}

	public void setId(TbEmployeePK id) {
		this.id = id;
	}

	public DmLocal getDmLocal() {
		return this.dmLocal;
	}

	public void setDmLocal(DmLocal dmLocal) {
		this.dmLocal = dmLocal;
	}

	public TbPerson getTbPerson() {
		return this.tbPerson;
	}

	public void setTbPerson(TbPerson tbPerson) {
		this.tbPerson = tbPerson;
	}

	public List<TbVaccination> getTbVaccinations() {
		return this.tbVaccinations;
	}

	public void setTbVaccinations(List<TbVaccination> tbVaccinations) {
		this.tbVaccinations = tbVaccinations;
	}

	public TbVaccination addTbVaccination(TbVaccination tbVaccination) {
		getTbVaccinations().add(tbVaccination);
		tbVaccination.setTbEmployee(this);

		return tbVaccination;
	}

	public TbVaccination removeTbVaccination(TbVaccination tbVaccination) {
		getTbVaccinations().remove(tbVaccination);
		tbVaccination.setTbEmployee(null);

		return tbVaccination;
	}

}