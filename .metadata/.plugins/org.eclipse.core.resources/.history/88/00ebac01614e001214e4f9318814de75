package com.leilei.dao.lawyer;

import java.util.List;

import javax.faces.bean.ManagedProperty;
import javax.persistence.Query;

import com.leilei.dao.LawyerBaseDao;
import com.leilei.domain.Admin;

/**
 * @author Leilei Lu(z82203)
 * 
 */
public class AdminDao {
	@ManagedProperty("#{lawyerBaseDao}")
	private LawyerBaseDao lawyerBaseDao;

	/**
	 * @param admin
	 *            Admin
	 * @return Admin
	 */
	public Admin addAdmin(Admin admin) {
		lawyerBaseDao.getEntityManager().getTransaction().begin();
		lawyerBaseDao.getEntityManager().persist(admin);
		lawyerBaseDao.getEntityManager().getTransaction().commit();
		lawyerBaseDao.close();
		return admin;
	}

	/**
	 * @param adminId
	 *            Long
	 * @return boolean
	 */
	public boolean removeAdmin(Long adminId) {
		lawyerBaseDao.getEntityManager().getTransaction().begin();
		Admin admin = lawyerBaseDao.getEntityManager().find(Admin.class, adminId);
		lawyerBaseDao.getEntityManager().remove(admin);
		lawyerBaseDao.getEntityManager().getTransaction().commit();
		lawyerBaseDao.close();
		return true;
	}

	/**
	 * @param adminId
	 *            Long
	 * @return Admin
	 */
	public Admin queryAdminById(Long adminId) {
		Admin admin = lawyerBaseDao.getEntityManager().find(Admin.class, adminId);
		return admin;
	}

	/**
	 * @param admin
	 *            Admin
	 * @return Admin
	 */
	public Admin update(Admin admin) {
		lawyerBaseDao.getEntityManager().getTransaction().begin();
		lawyerBaseDao.getEntityManager().merge(admin);
		Admin newAdmin = lawyerBaseDao.getEntityManager().find(Admin.class, admin.getAdminId());
		lawyerBaseDao.getEntityManager().getTransaction().commit();
		lawyerBaseDao.close();
		return newAdmin;
	}

	/**
	 * @return List<Admin>
	 */
	public List<Admin> queryAllAdmin() {
		Query queryAllAdminSql = lawyerBaseDao.getEntityManager().createNamedQuery(Admin.QUERY_ALL_ADMIN);
		@SuppressWarnings("unchecked")
		List<Admin> list = queryAllAdminSql.getResultList();
		return list;
	}

	/**
	 * @param admin Admin
	 * @return Admin
	 */
	public Admin login(Admin admin) {
		Query queryAllAdminSql = lawyerBaseDao.getEntityManager().createNamedQuery(Admin.LOGIN_BY_NAME_WORD);
		queryAllAdminSql.setParameter(Admin.USER_NAME, admin.getUserName());
		queryAllAdminSql.setParameter(Admin.PASSWORD, admin.getPassword());
		@SuppressWarnings("unchecked")
		List<Admin> list = queryAllAdminSql.getResultList();
		if (!list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * @return the lawyerBaseDao
	 */
	public LawyerBaseDao getLawyerBaseDao() {
		return lawyerBaseDao;
	}

	/**
	 * @param lawyerBaseDao
	 *            the lawyerBaseDao to set
	 */
	public void setLawyerBaseDao(LawyerBaseDao lawyerBaseDao) {
		this.lawyerBaseDao = lawyerBaseDao;
	}

}
