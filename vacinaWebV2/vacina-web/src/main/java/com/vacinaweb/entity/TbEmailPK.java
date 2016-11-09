package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_emails database table.
 * 
 */
@Embeddable
public class TbEmailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="seq_email")
	private Integer seqEmail;

	@Column(insertable=false, updatable=false)
	private Long cpf;

	public TbEmailPK() {
	}
	public Integer getSeqEmail() {
		return this.seqEmail;
	}
	public void setSeqEmail(Integer seqEmail) {
		this.seqEmail = seqEmail;
	}
	public Long getCpf() {
		return this.cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbEmailPK)) {
			return false;
		}
		TbEmailPK castOther = (TbEmailPK)other;
		return 
			this.seqEmail.equals(castOther.seqEmail)
			&& this.cpf.equals(castOther.cpf);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seqEmail.hashCode();
		hash = hash * prime + this.cpf.hashCode();
		
		return hash;
	}
}