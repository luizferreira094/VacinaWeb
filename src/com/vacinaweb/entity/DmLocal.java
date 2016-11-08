package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dm_local database table.
 * 
 */
@Entity
@Table(name="dm_local")
@NamedQuery(name="DmLocal.findAll", query="SELECT d FROM DmLocal d")
public class DmLocal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_local")
	private Integer idLocal;

	private String address;

	private String name;

	//bi-directional many-to-one association to TbEmployee
	@OneToMany(mappedBy="dmLocal")
	private List<TbEmployee> tbEmployees;

	public DmLocal() {
	}

	public Integer getIdLocal() {
		return this.idLocal;
	}

	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TbEmployee> getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(List<TbEmployee> tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public TbEmployee addTbEmployee(TbEmployee tbEmployee) {
		getTbEmployees().add(tbEmployee);
		tbEmployee.setDmLocal(this);

		return tbEmployee;
	}

	public TbEmployee removeTbEmployee(TbEmployee tbEmployee) {
		getTbEmployees().remove(tbEmployee);
		tbEmployee.setDmLocal(null);

		return tbEmployee;
	}

}