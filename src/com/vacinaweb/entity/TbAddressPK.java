package com.vacinaweb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tb_addresses database table.
 * 
 */
@Embeddable
public class TbAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="seq_address")
	private Integer seqAddress;

	@Column(insertable=false, updatable=false)
	private Long cpf;

	public TbAddressPK() {
	}
	public Integer getSeqAddress() {
		return this.seqAddress;
	}
	public void setSeqAddress(Integer seqAddress) {
		this.seqAddress = seqAddress;
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
		if (!(other instanceof TbAddressPK)) {
			return false;
		}
		TbAddressPK castOther = (TbAddressPK)other;
		return 
			this.seqAddress.equals(castOther.seqAddress)
			&& this.cpf.equals(castOther.cpf);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.seqAddress.hashCode();
		hash = hash * prime + this.cpf.hashCode();
		
		return hash;
	}
}