package com.icker.pm.vo;

public class UserProjectVO {
	private String userId;
	private String projectId;
	private String name;
	private String describes;
	private String createTime;
	private Integer sequence;
	
	/**
	 * 有关项目成员的数据
	 */
	private String email;
	private String password;
	private String nick;
	private String regDate;
	private String status;
	private String active;
	private String role;
	
	
	public UserProjectVO(String userId, String projectId, String email,
			String password, String nick, String status,
			String active) {
		super();
		this.userId = userId;
		this.projectId = projectId;
		this.email = email;
		this.password = password;
		this.nick = nick;
//		this.regDate = new Timestamp(regDate.getTime());
		this.status = status;
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribes() {
		return describes;
	}
	public void setDescribes(String describes) {
		this.describes = describes;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public UserProjectVO(String userId, String projectId, String name,
			String describes, String createTime) {
		super();
		this.userId = userId;
		this.projectId = projectId;
		this.name = name;
		this.describes = describes;
		this.createTime = createTime;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	
}
