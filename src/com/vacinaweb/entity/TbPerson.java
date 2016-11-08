package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_person database table.
 * 
 */
@Entity
@Table(name="tb_person")
@NamedQuery(name="TbPerson.findAll", query="SELECT t FROM TbPerson t")
public class TbPerson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long cpf;

	@Temporal(TemporalType.DATE)
	@Column(name="dt_birth")
	private Date dtBirth;

	@Column(name="has_tattoo")
	private Boolean hasTattoo;

	private String name;

	private String rg;

	private Integer weight;

	//bi-directional one-to-one association to TbAccess
	@OneToOne(mappedBy="tbPerson")
	private TbAccess tbAccess;

	//bi-directional many-to-one association to TbAddress
	@OneToMany(mappedBy="tbPerson")
	private List<TbAddress> tbAddresses;

	//bi-directional many-to-many association to DmAllergy
	@ManyToMany
	@JoinTable(
		name="tb_allergies"
		, joinColumns={
			@JoinColumn(name="cpf")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_allergy")
			}
		)
	private List<DmAllergy> dmAllergies;

	//bi-directional many-to-one association to TbDependent
	@OneToMany(mappedBy="tbPerson1")
	private List<TbDependent> tbDependents1;

	//bi-directional many-to-one association to TbDependent
	@OneToMany(mappedBy="tbPerson2")
	private List<TbDependent> tbDependents2;

	//bi-directional many-to-many association to DmDisease
	@ManyToMany
	@JoinTable(
		name="tb_diseases"
		, joinColumns={
			@JoinColumn(name="cpf")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_disease")
			}
		)
	private List<DmDisease> dmDiseases;

	//bi-directional many-to-one association to TbEmail
	@OneToMany(mappedBy="tbPerson")
	private List<TbEmail> tbEmails;

	//bi-directional many-to-one association to TbEmployee
	@OneToMany(mappedBy="tbPerson")
	private List<TbEmployee> tbEmployees;

	//bi-directional many-to-one association to TbPhone
	@OneToMany(mappedBy="tbPerson")
	private List<TbPhone> tbPhones;

	//bi-directional many-to-one association to TbVaccination
	@OneToMany(mappedBy="tbPerson")
	private List<TbVaccination> tbVaccinations;

	public TbPerson() {
	}

	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Date getDtBirth() {
		return this.dtBirth;
	}

	public void setDtBirth(Date dtBirth) {
		this.dtBirth = dtBirth;
	}

	public Boolean getHasTattoo() {
		return this.hasTattoo;
	}

	public void setHasTattoo(Boolean hasTattoo) {
		this.hasTattoo = hasTattoo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public TbAccess getTbAccess() {
		return this.tbAccess;
	}

	public void setTbAccess(TbAccess tbAccess) {
		this.tbAccess = tbAccess;
	}

	public List<TbAddress> getTbAddresses() {
		return this.tbAddresses;
	}

	public void setTbAddresses(List<TbAddress> tbAddresses) {
		this.tbAddresses = tbAddresses;
	}

	public TbAddress addTbAddress(TbAddress tbAddress) {
		getTbAddresses().add(tbAddress);
		tbAddress.setTbPerson(this);

		return tbAddress;
	}

	public TbAddress removeTbAddress(TbAddress tbAddress) {
		getTbAddresses().remove(tbAddress);
		tbAddress.setTbPerson(null);

		return tbAddress;
	}

	public List<DmAllergy> getDmAllergies() {
		return this.dmAllergies;
	}

	public void setDmAllergies(List<DmAllergy> dmAllergies) {
		this.dmAllergies = dmAllergies;
	}

	public List<TbDependent> getTbDependents1() {
		return this.tbDependents1;
	}

	public void setTbDependents1(List<TbDependent> tbDependents1) {
		this.tbDependents1 = tbDependents1;
	}

	public TbDependent addTbDependents1(TbDependent tbDependents1) {
		getTbDependents1().add(tbDependents1);
		tbDependents1.setTbPerson1(this);

		return tbDependents1;
	}

	public TbDependent removeTbDependents1(TbDependent tbDependents1) {
		getTbDependents1().remove(tbDependents1);
		tbDependents1.setTbPerson1(null);

		return tbDependents1;
	}

	public List<TbDependent> getTbDependents2() {
		return this.tbDependents2;
	}

	public void setTbDependents2(List<TbDependent> tbDependents2) {
		this.tbDependents2 = tbDependents2;
	}

	public TbDependent addTbDependents2(TbDependent tbDependents2) {
		getTbDependents2().add(tbDependents2);
		tbDependents2.setTbPerson2(this);

		return tbDependents2;
	}

	public TbDependent removeTbDependents2(TbDependent tbDependents2) {
		getTbDependents2().remove(tbDependents2);
		tbDependents2.setTbPerson2(null);

		return tbDependents2;
	}

	public List<DmDisease> getDmDiseases() {
		return this.dmDiseases;
	}

	public void setDmDiseases(List<DmDisease> dmDiseases) {
		this.dmDiseases = dmDiseases;
	}

	public List<TbEmail> getTbEmails() {
		return this.tbEmails;
	}

	public void setTbEmails(List<TbEmail> tbEmails) {
		this.tbEmails = tbEmails;
	}

	public TbEmail addTbEmail(TbEmail tbEmail) {
		getTbEmails().add(tbEmail);
		tbEmail.setTbPerson(this);

		return tbEmail;
	}

	public TbEmail removeTbEmail(TbEmail tbEmail) {
		getTbEmails().remove(tbEmail);
		tbEmail.setTbPerson(null);

		return tbEmail;
	}

	public List<TbEmployee> getTbEmployees() {
		return this.tbEmployees;
	}

	public void setTbEmployees(List<TbEmployee> tbEmployees) {
		this.tbEmployees = tbEmployees;
	}

	public TbEmployee addTbEmployee(TbEmployee tbEmployee) {
		getTbEmployees().add(tbEmployee);
		tbEmployee.setTbPerson(this);

		return tbEmployee;
	}

	public TbEmployee removeTbEmployee(TbEmployee tbEmployee) {
		getTbEmployees().remove(tbEmployee);
		tbEmployee.setTbPerson(null);

		return tbEmployee;
	}

	public List<TbPhone> getTbPhones() {
		return this.tbPhones;
	}

	public void setTbPhones(List<TbPhone> tbPhones) {
		this.tbPhones = tbPhones;
	}

	public TbPhone addTbPhone(TbPhone tbPhone) {
		getTbPhones().add(tbPhone);
		tbPhone.setTbPerson(this);

		return tbPhone;
	}

	public TbPhone removeTbPhone(TbPhone tbPhone) {
		getTbPhones().remove(tbPhone);
		tbPhone.setTbPerson(null);

		return tbPhone;
	}

	public List<TbVaccination> getTbVaccinations() {
		return this.tbVaccinations;
	}

	public void setTbVaccinations(List<TbVaccination> tbVaccinations) {
		this.tbVaccinations = tbVaccinations;
	}

	public TbVaccination addTbVaccination(TbVaccination tbVaccination) {
		getTbVaccinations().add(tbVaccination);
		tbVaccination.setTbPerson(this);

		return tbVaccination;
	}

	public TbVaccination removeTbVaccination(TbVaccination tbVaccination) {
		getTbVaccinations().remove(tbVaccination);
		tbVaccination.setTbPerson(null);

		return tbVaccination;
	}

}