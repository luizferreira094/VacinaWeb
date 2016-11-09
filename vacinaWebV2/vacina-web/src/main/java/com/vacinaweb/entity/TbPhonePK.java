package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_phones database table.
 * 
 */
@Embeddable
public class TbPhonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Long cpf;

	@Column(name="seq_phone")
	private Integer seqPhone;

	public TbPhonePK() {
	}
	public Long getCpf() {
		return this.cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Integer getSeqPhone() {
		return this.seqPhone;
	}
	public void setSeqPhone(Integer seqPhone) {
		this.seqPhone = seqPhone;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbPhonePK)) {
			return false;
		}
		TbPhonePK castOther = (TbPhonePK)other;
		return 
			this.cpf.equals(castOther.cpf)
			&& this.seqPhone.equals(castOther.seqPhone);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cpf.hashCode();
		hash = hash * prime + this.seqPhone.hashCode();
		
		return hash;
	}
}