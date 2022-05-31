package com.example.workflow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "jobs")
public class Job {
	
	public Job() {
		
	}
     
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobId;
	
	@Column(name="job" ,nullable=false, length=1000)
	private String menu;
	
	
	@Column(name="acceptCount" ,updatable=true, length=20)
	private Integer acceptCount=0;
	
	@Column(name="rejectCount" ,updatable=true, length=20)
	private Integer rejectCount=0;
	
	@Column(name="status", length=20)
	private String status="Nil";
	
	@Column(name="assign", nullable=false, length=20)
	private String assign;

	public String getAssign() {
		return assign;
	}

	public void setAssign(String assign) {
		this.assign = assign;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getAcceptCount() {
		return acceptCount;
	}

	public void setAcceptCount(Integer acceptCount) {
		this.acceptCount = acceptCount;
	}

	
	public Integer getRejectCount() {
		return rejectCount;
	}

	public void setRejectCount(Integer rejectCount) {
		this.rejectCount = rejectCount;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	

	
	
}
