package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.model.StudentModel;
import com.example.demo.response.Response;
import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private IStudentService service;

	@PostMapping()
	public ResponseEntity<StudentModel> createStudent(@RequestBody StudentModel model) {
		service.create(model);
		return new ResponseEntity<StudentModel>(model, HttpStatus.OK);
	}

	@GetMapping("/{enrollmentNumber}")
	public ResponseEntity<Response> getStudentById(@PathVariable("enrollmentNumber") Long enrollmentNumber) {
		StudentModel model = service.getEnrollmentNumber(enrollmentNumber);

		Response response = null;
		if (model != null) {
			response = new Response(new Date(), "SUCCESSFULL", null, model);
		} else {
			List<String> errorMessage = new ArrayList<>();
			errorMessage.add("Student not found");
			errorMessage.add("Please check your given enrollmentNumber.");
			response = new Response(new Date(), "UNSUCCESSFULL", errorMessage, null);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<StudentEntity>> getByField(@RequestParam Integer age, @RequestParam String address) {
		return new ResponseEntity<List<StudentEntity>>(service.get(age, address), HttpStatus.OK);

	}

	@GetMapping("/count")
	public ResponseEntity<Long> getByEnrollementId(@RequestParam String address) {
		long count = service.getByAddress(address);

		return new ResponseEntity<Long>(count, HttpStatus.OK);
	}

	@DeleteMapping("/{enrollmentNumber}")
	public StudentModel deleteByEnrollNumber(@PathVariable("enrollmentNumber") long enrollmentNumber) {
		System.out.println(enrollmentNumber);
		return service.delete(enrollmentNumber);
	}

	@GetMapping("/all")
	public List<StudentEntity> allStudents() {
		System.out.println(service.getStudents());
		return service.getStudents();

	}

	@PutMapping("/{enrollmentNumber}")
	public ResponseEntity<StudentModel> updateByID(@PathVariable long enrollmentNumber,
			@RequestBody StudentModel model) {
		return new ResponseEntity<StudentModel>(service.update(model, enrollmentNumber), HttpStatus.OK);
	}

	@GetMapping("/check")
	public List<StudentEntity> name(@RequestParam String fatherName, @RequestParam Long mobileNumber) {
		System.out.println(service.sameDataRecode(fatherName, mobileNumber));
		return service.sameDataRecode(fatherName, mobileNumber);
	}

}
