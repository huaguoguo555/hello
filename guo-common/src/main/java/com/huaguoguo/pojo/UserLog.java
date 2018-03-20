package com.huaguoguo.pojo;

import java.util.Date;

public class UserLog {

	private Long id;
	private Long userId;
	/**
	 * 操作类型， 1-增， 2-删，3-改
	 */
	private Integer type;
	/**
	 * 操作时间
	 */
	private Date date;
	/**
	 * 操作记录
	 */
	private String message;
	
	/**
	 * 操作人
	 */
	private Long opeId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getOpeId() {
		return opeId;
	}
	public void setOpeId(Long opeId) {
		this.opeId = opeId;
	}
	@Override
	public String toString() {
		return "UserLog [id=" + id + ", userId=" + userId + ", type=" + type + ", date=" + date + ", message=" + message
				+ ", opeId=" + opeId + "]";
	}
	
	
}
