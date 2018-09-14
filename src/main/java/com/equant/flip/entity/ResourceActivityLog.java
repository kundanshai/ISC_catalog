package com.equant.flip.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_x_partnum_alst")
public class ResourceActivityLog {
	@Id
	@Column(name = "entry_time")
	private Date entryTime;
	
	@Column(name="add_info")
	private String additionalInformation;
	
	@Column(name = "login_name")
	private String loginName;
	
	@Column(name = "act_name")
	private String activityName;
	
	@Column(name = "x_work_group")
	private String workGroup;

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getWorkGroup() {
		return workGroup;
	}

	public void setWorkGroup(String workGroup) {
		this.workGroup = workGroup;
	}
	
	
	

}
