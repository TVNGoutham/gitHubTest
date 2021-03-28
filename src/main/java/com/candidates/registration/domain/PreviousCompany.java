package com.candidates.registration.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class PreviousCompany {

	@Column(name = "pre_company_name")
	private String companyName;
	
	@Column(name = "pre_salary")
	private int salary;

	public PreviousCompany() {
		
	}

	public PreviousCompany(String companyName, int salary) {
		
		this.companyName = companyName;
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PreviousCompany [companyName=" + companyName + ", salary=" + salary + "]";
	}

}
