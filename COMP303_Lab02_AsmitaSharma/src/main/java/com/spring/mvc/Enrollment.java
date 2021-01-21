package com.spring.mvc;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enrollment 
{
	@Id
	private int applicationNO;
	private String status;
	private int amountPaid;
	private Date startDate;
	private int studentID;
	private int programCode;
	public int getApplicationNO() {
		return applicationNO;
	}
	public void setApplicationNO(int applicationNO) {
		this.applicationNO = applicationNO;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getProgramCode() {
		return programCode;
	}
	public void setProgramCode(int programCode) {
		this.programCode = programCode;
	}
}
