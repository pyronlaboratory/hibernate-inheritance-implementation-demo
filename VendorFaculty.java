package com.persistence.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VendorFaculty")
public class VendorFaculty extends Faculty {

	@Column(name="WAGES",length=10,precision=2)
	private double wages;

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	} 
}
