package com.johnny.store.entity;

public class BrandHotEntity{
	private int brandHotID;
	private int brandID;
	private String startDate;
	private String endDate;
	private String status;
	private String inUser;
	private String inDate;
	private String lastEditUser;
	private String lastEditDate;

	public int getBrandHotID() {
		return this.brandHotID;
	}

	public void setBrandHotID(int brandHotID) {
		this.brandHotID = brandHotID;
	}

	public int getBrandID() {
		return this.brandID;
	}

	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInUser() {
		return this.inUser;
	}

	public void setInUser(String inUser) {
		this.inUser = inUser;
	}

	public String getInDate() {
		return this.inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getLastEditUser() {
		return this.lastEditUser;
	}

	public void setLastEditUser(String lastEditUser) {
		this.lastEditUser = lastEditUser;
	}

	public String getLastEditDate() {
		return this.lastEditDate;
	}

	public void setLastEditDate(String lastEditDate) {
		this.lastEditDate = lastEditDate;
	}

}