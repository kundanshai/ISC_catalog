package com.equant.flip.model;

import java.io.Serializable;
import java.util.Date;

public class ActivityLog implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String activityName;
	private String userName;
	private String workGroup;
	private String additionalInformation;
	private Date createdDate;
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getWorkGroup() {
		return workGroup;
	}
	public void setWorkGroup(String workGroup) {
		this.workGroup = workGroup;
	}
	public String getAdditionalInformation() {
		return additionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

}
