package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dm_vaccine_type database table.
 * 
 */
@Entity
@Table(name="dm_vaccine_type")
@NamedQuery(name="DmVaccineType.findAll", query="SELECT d FROM DmVaccineType d")
public class DmVaccineType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_type")
	private Integer idType;

	private String name;

	//bi-directional many-to-one association to TbVaccine
	@OneToMany(mappedBy="dmVaccineType")
	private List<TbVaccine> tbVaccines;

	public DmVaccineType() {
	}

	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TbVaccine> getTbVaccines() {
		return this.tbVaccines;
	}

	public void setTbVaccines(List<TbVaccine> tbVaccines) {
		this.tbVaccines = tbVaccines;
	}

	public TbVaccine addTbVaccine(TbVaccine tbVaccine) {
		getTbVaccines().add(tbVaccine);
		tbVaccine.setDmVaccineType(this);

		return tbVaccine;
	}

	public TbVaccine removeTbVaccine(TbVaccine tbVaccine) {
		getTbVaccines().remove(tbVaccine);
		tbVaccine.setDmVaccineType(null);

		return tbVaccine;
	}

}