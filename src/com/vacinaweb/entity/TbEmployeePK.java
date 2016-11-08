package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_employees database table.
 * 
 */
@Embeddable
public class TbEmployeePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Long cre;

	@Column(name="id_local", insertable=false, updatable=false)
	private Integer idLocal;

	public TbEmployeePK() {
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
		if (!(other instanceof TbEmployeePK)) {
			return false;
		}
		TbEmployeePK castOther = (TbEmployeePK)other;
		return 
			this.cre.equals(castOther.cre)
			&& this.idLocal.equals(castOther.idLocal);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cre.hashCode();
		hash = hash * prime + this.idLocal.hashCode();
		
		return hash;
	}
}