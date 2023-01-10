package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public StudentModel create(StudentModel student) {
		StudentEntity entity = new StudentEntity();
//		StudentDTO dto = modelToDto(student);
		entity.setName(student.getName());
		entity.setClassName(student.getClassName());
		entity.setAge(student.getAge());
		entity.setFatherName(student.getFatherName());
		entity.setAdmissionDate(student.getAdmissionDate());
		entity.setMobileNumber(student.getMobileNumber());
		entity.setAddress(student.getAddress());
		entity.setCreatedDate(student.getCreatedDate());
		entity.setUpdatedDate(student.getUpdatedDate());
		entity.setEnrollmentNumber(student.getEnrollmentNumber());
		repository.save(entity);
		student.setId(entity.getId());
		return student;
	}

	@Override
	public StudentModel getEnrollmentNumber(Long enrollmentNumber) {
		Optional<StudentEntity> optional = repository.findById(enrollmentNumber);
		StudentModel model = null;

		if (optional.isPresent()) {
			StudentEntity studentOptional = optional.get();
			model = new StudentModel();
			model.setId(studentOptional.getId());
			model.setEnrollmentNumber(studentOptional.getEnrollmentNumber());
			model.setName(studentOptional.getName());
			model.setFatherName(studentOptional.getFatherName());
			model.setClassName(studentOptional.getClassName());
			model.setAddress(studentOptional.getAddress());
			model.setMobileNumber(studentOptional.getMobileNumber());
			model.setAdmissionDate(studentOptional.getAdmissionDate());
			model.setCreatedDate(studentOptional.getCreatedDate());
			model.setUpdatedDate(studentOptional.getUpdatedDate());
			model.setAge(studentOptional.getAge());
		}
		return model;
	}

	@Override
	public List<StudentEntity> get(Integer age, String address) {
		List<StudentEntity> nameAndAddress = repository.findByAgeAndAddress(age, address);
		System.out.println(nameAndAddress);
		return nameAndAddress;
	}

	@Override
	public long getByAddress(String address) {
		long addreslist = repository.countByAddress(address);
		System.out.println(addreslist);
		return addreslist;
	}

	@Override
	public StudentModel delete(long enrollmentNumber) {
		StudentModel model = repository.deleteById(enrollmentNumber);
		System.out.println(model);
		return model;
	}

	@Override
	public List<StudentEntity> getStudents() {
//		List<StudentEntity> data = repository.findAll();
		return repository.findAll();
	}

	@Override
	public StudentModel update(StudentModel model, long enrollmentNumber) {
		Optional<StudentEntity> optional = repository.findById(enrollmentNumber);
		if (optional.isPresent()) {
			StudentEntity entity = optional.get();
			entity.setName(model.getName());
			entity.setFatherName(model.getFatherName());
			entity.setClassName(model.getClassName());
			entity.setAddress(optional.get().getAddress());
			entity.setMobileNumber(optional.get().getMobileNumber());
			entity.setId(optional.get().getId());
			entity.setAge(optional.get().getAge());
			entity.setCreatedDate(optional.get().getCreatedDate());
			entity.setAdmissionDate(optional.get().getAdmissionDate());
			entity.setUpdatedDate(new Date());
			repository.save(entity);
		} else {
			System.out.println("Given EnrollementNumber is not found...");
		}
		return model;
	}

	@Override
	public List<StudentEntity> sameDataRecode(String fatherName, Long mobileNumber) {
		List<StudentEntity> nameOfList = repository.findAllStudents(fatherName, mobileNumber);
		System.out.println(nameOfList);
		return nameOfList;
	}

}
