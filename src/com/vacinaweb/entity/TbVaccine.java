package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_vaccines database table.
 * 
 */
@Entity
@Table(name="tb_vaccines")
@NamedQuery(name="TbVaccine.findAll", query="SELECT t FROM TbVaccine t")
public class TbVaccine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_vaccine")
	private Integer idVaccine;

	private Integer lot;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date validate;

	//bi-directional many-to-one association to TbVaccination
	@OneToMany(mappedBy="tbVaccine")
	private List<TbVaccination> tbVaccinations;

	//bi-directional many-to-one association to DmVaccineType
	@ManyToOne
	@JoinColumn(name="id_type")
	private DmVaccineType dmVaccineType;

	public TbVaccine() {
	}

	public Integer getIdVaccine() {
		return this.idVaccine;
	}

	public void setIdVaccine(Integer idVaccine) {
		this.idVaccine = idVaccine;
	}

	public Integer getLot() {
		return this.lot;
	}

	public void setLot(Integer lot) {
		this.lot = lot;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getValidate() {
		return this.validate;
	}

	public void setValidate(Date validate) {
		this.validate = validate;
	}

	public List<TbVaccination> getTbVaccinations() {
		return this.tbVaccinations;
	}

	public void setTbVaccinations(List<TbVaccination> tbVaccinations) {
		this.tbVaccinations = tbVaccinations;
	}

	public TbVaccination addTbVaccination(TbVaccination tbVaccination) {
		getTbVaccinations().add(tbVaccination);
		tbVaccination.setTbVaccine(this);

		return tbVaccination;
	}

	public TbVaccination removeTbVaccination(TbVaccination tbVaccination) {
		getTbVaccinations().remove(tbVaccination);
		tbVaccination.setTbVaccine(null);

		return tbVaccination;
	}

	public DmVaccineType getDmVaccineType() {
		return this.dmVaccineType;
	}

	public void setDmVaccineType(DmVaccineType dmVaccineType) {
		this.dmVaccineType = dmVaccineType;
	}

}