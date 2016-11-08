package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dm_disease database table.
 * 
 */
@Entity
@Table(name="dm_disease")
@NamedQuery(name="DmDisease.findAll", query="SELECT d FROM DmDisease d")
public class DmDisease implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_disease")
	private Integer idDisease;

	private String name;

	//bi-directional many-to-many association to TbPerson
	@ManyToMany(mappedBy="dmDiseases")
	private List<TbPerson> tbPersons;

	public DmDisease() {
	}

	public Integer getIdDisease() {
		return this.idDisease;
	}

	public void setIdDisease(Integer idDisease) {
		this.idDisease = idDisease;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TbPerson> getTbPersons() {
		return this.tbPersons;
	}

	public void setTbPersons(List<TbPerson> tbPersons) {
		this.tbPersons = tbPersons;
	}

}