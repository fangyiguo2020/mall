package com.beans;

/**
 * 管理员实体类
 */
public class AdminInfo {
	private Integer id;
    private String adminName;
    private String password;
    private String nickName;
    private String state;  //管理员的状态  可能有锁定,已删除,可用等
    
	public String toString() {
		return "AdminAction [id=" + id + ", adminName=" + adminName + ", password=" + password + ", nickName="+ nickName + ", state=" + state + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
