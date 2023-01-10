package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.StudentEntity;
import com.example.demo.model.StudentModel;

public interface IStudentService {
	public StudentModel create(StudentModel student);

	public StudentModel getEnrollmentNumber(Long enrollmentNumber);

	public List<StudentEntity> get(Integer age, String address);

	public long getByAddress(String address);

	public StudentModel delete(long enrollmentNumber);

	public List<StudentEntity> getStudents();

	public StudentModel update(StudentModel model, long enrollmentNumber);

	public List<StudentEntity> sameDataRecode(String fatherName, Long mobileNumber);

}
