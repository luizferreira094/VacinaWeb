package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_vaccinations database table.
 * 
 */
@Embeddable
public class TbVaccinationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Long cpf;

	@Column(name="id_vaccine", insertable=false, updatable=false)
	private Integer idVaccine;

	@Temporal(TemporalType.DATE)
	@Column(name="date_vaccination")
	private java.util.Date dateVaccination;

	@Column(insertable=false, updatable=false)
	private Long cre;

	@Column(name="id_local", insertable=false, updatable=false)
	private Integer idLocal;

	public TbVaccinationPK() {
	}
	public Long getCpf() {
		return this.cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Integer getIdVaccine() {
		return this.idVaccine;
	}
	public void setIdVaccine(Integer idVaccine) {
		this.idVaccine = idVaccine;
	}
	public java.util.Date getDateVaccination() {
		return this.dateVaccination;
	}
	public void setDateVaccination(java.util.Date dateVaccination) {
		this.dateVaccination = dateVaccination;
	}
	public Long getCre() {
		return this.cre;
	}
	public void setCre(Long cre) {
		this.cre = cre;
	}
	public Integer getIdLocal() {
		return this.idLocal;
	}
	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbVaccinationPK)) {
			return false;
		}
		TbVaccinationPK castOther = (TbVaccinationPK)other;
		return 
			this.cpf.equals(castOther.cpf)
			&& this.idVaccine.equals(castOther.idVaccine)
			&& this.dateVaccination.equals(castOther.dateVaccination)
			&& this.cre.equals(castOther.cre)
			&& this.idLocal.equals(castOther.idLocal);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cpf.hashCode();
		hash = hash * prime + this.idVaccine.hashCode();
		hash = hash * prime + this.dateVaccination.hashCode();
		hash = hash * prime + this.cre.hashCode();
		hash = hash * prime + this.idLocal.hashCode();
		
		return hash;
	}
}