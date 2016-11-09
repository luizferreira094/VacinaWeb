package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the dm_dependence_type database table.
 * 
 */
@Entity
@Table(name="dm_dependence_type")
@NamedQuery(name="DmDependenceType.findAll", query="SELECT d FROM DmDependenceType d")
public class DmDependenceType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_dependence_type")
	private Integer idDependenceType;

	private String description;

	//bi-directional many-to-one association to TbDependent
	@OneToMany(mappedBy="dmDependenceType")
	private List<TbDependent> tbDependents;

	public DmDependenceType() {
	}

	public Integer getIdDependenceType() {
		return this.idDependenceType;
	}

	public void setIdDependenceType(Integer idDependenceType) {
		this.idDependenceType = idDependenceType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TbDependent> getTbDependents() {
		return this.tbDependents;
	}

	public void setTbDependents(List<TbDependent> tbDependents) {
		this.tbDependents = tbDependents;
	}

	public TbDependent addTbDependent(TbDependent tbDependent) {
		getTbDependents().add(tbDependent);
		tbDependent.setDmDependenceType(this);

		return tbDependent;
	}

	public TbDependent removeTbDependent(TbDependent tbDependent) {
		getTbDependents().remove(tbDependent);
		tbDependent.setDmDependenceType(null);

		return tbDependent;
	}

}