package com.example.demo.dto;

import java.util.Date;

public class StudentDTO {
	private Long id;
	private Long enrollmentNumber;
	private String name;
	private Integer age;
	private Long className;
	private Long mobileNumber;
	private Date admissionDate;
	private String fatherName;
	private String address;
	private Date createdDate;
	private Date updatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(Long enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getClassName() {
		return className;
	}

	public void setClassName(Long className) {
		this.className = className;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", enrollmentNumber=" + enrollmentNumber + ", name=" + name + ", age=" + age
				+ ", className=" + className + ", admissionDate=" + admissionDate + ", fatherName=" + fatherName
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
