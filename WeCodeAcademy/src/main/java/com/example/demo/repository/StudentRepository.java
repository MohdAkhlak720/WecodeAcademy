package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;
import com.example.demo.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

	List<StudentEntity> findByAgeAndAddress(Integer age, String address);

	long countByAddress(String address);

	public StudentModel deleteById(long enrollmentNumber);

	@Query(value = "select * from student s where s.father_Name =?1 and s.mobile_Number = ?2", nativeQuery = true)
	List<StudentEntity> findAllStudents(String fatherName, Long mobileNumber);
}
