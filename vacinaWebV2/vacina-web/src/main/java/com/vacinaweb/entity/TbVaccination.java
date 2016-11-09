package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_vaccinations database table.
 * 
 */
@Entity
@Table(name="tb_vaccinations")
@NamedQuery(name="TbVaccination.findAll", query="SELECT t FROM TbVaccination t")
public class TbVaccination implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbVaccinationPK id;

	private Integer dose;

	//bi-directional many-to-one association to TbEmployee
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="cre", referencedColumnName="cre"),
		@JoinColumn(name="id_local", referencedColumnName="id_local")
		})
	private TbEmployee tbEmployee;

	//bi-directional many-to-one association to TbPerson
	@ManyToOne
	@JoinColumn(name="cpf")
	private TbPerson tbPerson;

	//bi-directional many-to-one association to TbVaccine
	@ManyToOne
	@JoinColumn(name="id_vaccine")
	private TbVaccine tbVaccine;

	public TbVaccination() {
	}

	public TbVaccinationPK getId() {
		return this.id;
	}

	public void setId(TbVaccinationPK id) {
		this.id = id;
	}

	public Integer getDose() {
		return this.dose;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}

	public TbEmployee getTbEmployee() {
		return this.tbEmployee;
	}

	public void setTbEmployee(TbEmployee tbEmployee) {
		this.tbEmployee = tbEmployee;
	}

	public TbPerson getTbPerson() {
		return this.tbPerson;
	}

	public void setTbPerson(TbPerson tbPerson) {
		this.tbPerson = tbPerson;
	}

	public TbVaccine getTbVaccine() {
		return this.tbVaccine;
	}

	public void setTbVaccine(TbVaccine tbVaccine) {
		this.tbVaccine = tbVaccine;
	}

}