package com.zstrength.obj.pojo;
// Generated Mar 28, 2017 3:53:41 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * ObjAds generated by hbm2java
 */
public class ObjAds implements java.io.Serializable {

	private ObjAdsId id;
	private String remark;
	private int employeeId;
	private Date updatedDatetime;
	private Date createdDatetime;

	public ObjAds() {
	}

	public ObjAds(ObjAdsId id, int employeeId) {
		this.id = id;
		this.employeeId = employeeId;
	}

	public ObjAds(ObjAdsId id, String remark, int employeeId, Date updatedDatetime, Date createdDatetime) {
		this.id = id;
		this.remark = remark;
		this.employeeId = employeeId;
		this.updatedDatetime = updatedDatetime;
		this.createdDatetime = createdDatetime;
	}

	public ObjAdsId getId() {
		return this.id;
	}

	public void setId(ObjAdsId id) {
		this.id = id;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getUpdatedDatetime() {
		return this.updatedDatetime;
	}

	public void setUpdatedDatetime(Date updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

	public Date getCreatedDatetime() {
		return this.createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

}
