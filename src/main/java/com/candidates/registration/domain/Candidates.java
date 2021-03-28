package com.candidates.registration.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unique_id")
	private Long uniqueId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private String phone;

	@Column(name = "country_name")
	private String country;

	@Column(name = "current_company_name")
	private String currentCompanyName;

//--
	@Embedded
	private PreviousCompany previousCompanyDetails;

	@Column(name = "experience_years")
	private double experience;

	@Column(name = "skills_multiple")
	private String skills;
	
	public Candidates() {

	}

	public Candidates(Long uniqueId, String firstName, String lastName, String phone, String country,
			String currentCompanyName, double experience, String skills, PreviousCompany previousCompanyDetails) {
		
		this.uniqueId = uniqueId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.country = country;
		this.currentCompanyName = currentCompanyName;
		this.experience = experience;
		this.skills = skills;
		this.previousCompanyDetails = previousCompanyDetails;
	}

	public Long getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrentCompanyName() {
		return currentCompanyName;
	}

	public void setCurrentCompanyName(String currentCompanyName) {
		this.currentCompanyName = currentCompanyName;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public PreviousCompany getPreviousCompanyDetails() {
		return previousCompanyDetails;
	}

	public void setPreviousCompany(PreviousCompany previousCompanyDetails) {
		this.previousCompanyDetails = previousCompanyDetails;
	}

	@Override
	public String toString() {
		return "Candidates [uniqueId=" + uniqueId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
				+ phone + ", country=" + country + ", currentCompanyName=" + currentCompanyName + ", experience="
				+ experience + ", skills=" + skills + ", previousCompanyDetails=" + previousCompanyDetails + "]";
	}	
	
	
}
