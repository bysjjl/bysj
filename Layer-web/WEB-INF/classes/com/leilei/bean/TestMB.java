package com.leilei.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.leilei.dao.lawyer.AdminDao;
import com.leilei.domain.Admin;

/**
 * @author Leilei Lu(z82203)
 * 
 */
@ManagedBean
@SessionScoped
public class TestMB {
	private Admin admin = new Admin();
	@ManagedProperty("#{adminDao}")
	private AdminDao adminDao;

	/**
	 * Test the add admin.
	 * 
	 * @return String
	 */
	public String addAdminTest() {
		adminDao.addAdmin(admin);
		return "ok";
	}

	/**
	 * @return String
	 */
	public String queryAdminByID() {
		adminDao.queryAdminById(admin.getAdminId());
		return "ok";
	}

	/**
	 * @return String
	 */
	public String queryAllAdmin() {
		adminDao.queryAllAdmin();
		return "ok";

	}
	
	/**
	 * @return String
	 */ 
	public String login() {
		adminDao.login(admin);
		return "ok";
	}

	/**
	 * @return String
	 */
	public String deleteAdminById() {
		adminDao.removeAdmin(admin.getAdminId());
		return "ok";
	}

	/**
	 * @return the admin
	 */
	public Admin getAdmin() {
		return admin;
	}

	/**
	 * @param admin
	 *            the admin to set
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	/**
	 * @return the adminDao
	 */
	public AdminDao getAdminDao() {
		return adminDao;
	}

	/**
	 * @param adminDao
	 *            the adminDao to set
	 */
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

}
