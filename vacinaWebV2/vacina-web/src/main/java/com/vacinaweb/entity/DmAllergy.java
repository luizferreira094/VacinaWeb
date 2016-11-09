package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dm_allergy database table.
 * 
 */
@Entity
@Table(name="dm_allergy")
@NamedQuery(name="DmAllergy.findAll", query="SELECT d FROM DmAllergy d")
public class DmAllergy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_allergy")
	private Integer idAllergy;

	private String name;

	//bi-directional many-to-many association to TbPerson
	@ManyToMany(mappedBy="dmAllergies")
	private List<TbPerson> tbPersons;

	public DmAllergy() {
	}

	public Integer getIdAllergy() {
		return this.idAllergy;
	}

	public void setIdAllergy(Integer idAllergy) {
		this.idAllergy = idAllergy;
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