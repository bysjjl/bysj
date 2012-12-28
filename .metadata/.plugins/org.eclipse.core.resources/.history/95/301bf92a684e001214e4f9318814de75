package com.leilei.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Leilei Lu(z82203)
 * 
 */
@Entity
@Table(name = "Admin")
@NamedQueries({
	@NamedQuery(name = Admin.LOGIN_BY_NAME_WORD, query = "SELECT aa FROM Admin aa WHERE aa.userName=:" + Admin.USER_NAME
		+ " AND aa.password =:" + Admin.PASSWORD),
	@NamedQuery(name = Admin.QUERY_ALL_ADMIN, query = "SELECT rr FROM Admin rr")
	})
public class Admin implements Serializable {
	private static final long serialVersionUID = -8767352741717530574L;
	public static final String QUERY_ALL_ADMIN = "queryAllAdmin";
	public static final String LOGIN_BY_NAME_WORD = "loginByNameAndPassword";
	public static final String ADMIN_ID = "adminId";
	public static final String USER_NAME = "userName";
	public static final String PASSWORD = "password";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "admin_id")
	private Long adminId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

	/**
	 * @return the adminId
	 */
	public Long getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId
	 *            the adminId to set
	 */
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

}
