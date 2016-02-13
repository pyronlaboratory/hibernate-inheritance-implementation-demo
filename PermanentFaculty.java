package com.persistence.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("PermanentFaculty")
public class PermanentFaculty extends Faculty {

	@Column(name="SALARY",length=10,precision=2) 
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
