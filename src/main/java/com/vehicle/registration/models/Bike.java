package com.vehicle.registration.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Bike {
	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purcharePrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public BigDecimal getPurcharePrice() {
		return purcharePrice;
	}
	public void setPurcharePrice(BigDecimal purcharePrice) {
		this.purcharePrice = purcharePrice;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public boolean isContact() {
		return contact;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}
	private Date purchaseDate;
	private boolean contact;

}
