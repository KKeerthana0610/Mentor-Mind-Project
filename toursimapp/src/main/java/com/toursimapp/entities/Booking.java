package com.toursimapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Double date;
	@Column (length = 30)
	private String place;
	@Column (length = 30)
	private String payment;
	@Column (length = 30)
	public Double getDate() {
		return date;
	}
	public void setDate(Double date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Booking [date=" + date + ", place=" + place + ", payment=" + payment + "]";
	}
	

}
