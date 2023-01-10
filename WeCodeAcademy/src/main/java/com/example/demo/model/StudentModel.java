package com.example.demo.model;

import java.util.Date;

public class StudentModel {

	private Long id;
	private Long className;
	private Long mobileNumber;
	private Long enrollmentNumber;
	private Integer age;
	private String name;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "StudentModel [id=" + id + ", enrollmentNumber=" + enrollmentNumber + ", age=" + age + ", name=" + name
				+ ", className=" + className + ", admissionDate=" + admissionDate + ", fatherName=" + fatherName
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
