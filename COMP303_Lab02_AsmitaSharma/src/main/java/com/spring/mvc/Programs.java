package com.spring.mvc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Programs 
{
	@Id
	private int programCode;
	private String programName;
	private int duration;
	private int fee;
	private int studentId;
	private int applicationNo;
	public int getProgramCode() {
		return programCode;
	}
	public void setProgramCode(int programCode) {
		this.programCode = programCode;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(int applicationNo) {
		this.applicationNo = applicationNo;
	}
	
}
