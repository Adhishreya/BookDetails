package com.details.entity;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class StatusEntity {
	private enum Status{
		COD,PAID,FAIL
	};
	@Enumerated(EnumType.STRING)
	private Status s;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatusEntity other = (StatusEntity) obj;
		if (s != other.s)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StatusEntity [s=" + s + "]";
	}
	public Status getS() {
		return s;
	}
	public void setS(Status s) {
		this.s = s;
	}
}
