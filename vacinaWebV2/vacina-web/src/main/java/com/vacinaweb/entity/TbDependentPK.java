package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_dependents database table.
 * 
 */
@Embeddable
public class TbDependentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Long cpf;

	@Column(name="cpf_dependent", insertable=false, updatable=false)
	private Long cpfDependent;

	@Column(name="id_dependence_type", insertable=false, updatable=false)
	private Integer idDependenceType;

	public TbDependentPK() {
	}
	public Long getCpf() {
		return this.cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getCpfDependent() {
		return this.cpfDependent;
	}
	public void setCpfDependent(Long cpfDependent) {
		this.cpfDependent = cpfDependent;
	}
	public Integer getIdDependenceType() {
		return this.idDependenceType;
	}
	public void setIdDependenceType(Integer idDependenceType) {
		this.idDependenceType = idDependenceType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbDependentPK)) {
			return false;
		}
		TbDependentPK castOther = (TbDependentPK)other;
		return 
			this.cpf.equals(castOther.cpf)
			&& this.cpfDependent.equals(castOther.cpfDependent)
			&& this.idDependenceType.equals(castOther.idDependenceType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cpf.hashCode();
		hash = hash * prime + this.cpfDependent.hashCode();
		hash = hash * prime + this.idDependenceType.hashCode();
		
		return hash;
	}
}