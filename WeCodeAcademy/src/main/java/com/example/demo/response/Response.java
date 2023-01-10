package com.example.demo.response;

import java.util.Date;
import java.util.List;

import com.example.demo.model.StudentModel;

public class Response {
	private Date date;
	private String status;
	private List<String> errorMessage;
	private StudentModel data;

	public Response(Date date, String status, List<String> errorMessage, StudentModel data) {
		super();
		this.date = date;
		this.status = status;
		this.errorMessage = errorMessage;
		this.data = data;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(List<String> errorMessage) {
		this.errorMessage = errorMessage;
	}

	public StudentModel getData() {
		return data;
	}

	public void setData(StudentModel data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [date=" + date + ", status=" + status + ", errorMessage=" + errorMessage + ", data=" + data
				+ "]";
	}

}
