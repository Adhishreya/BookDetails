//package com.details.entity;
//
//import javax.persistence.Convert;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//
//import com.utility.managers.StatusAttributeConverter;
//
//@Entity
//public class PaymentDetails {
//	@EmbeddedId
//	@Convert(converter = StatusAttributeConverter.class)
//	private StatusEntity status;
//
//	private Double total;
//
//	public StatusEntity getStatus() {
//		return status;
//	}
//
//	public void setStatus(StatusEntity status) {
//		this.status = status;
//	}
//
//	public Double getTotal() {
//		return total;
//	}
//
//	public void setTotal(Double total) {
//		this.total = total;
//	}
//
//}
