package com.leilei.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Leilei Lu(z82203)
 *
 */
public class LawyerBaseDao {
	private EntityManager entityManager;
	private EntityManagerFactory emf;

	/**
	 * Init the EntityManager.
	 */
	public LawyerBaseDao() {
		emf = Persistence.createEntityManagerFactory("lawyer-web");
		entityManager = emf.createEntityManager();
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager
	 *            the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void close() {
		entityManager.close();
		emf.close();
	}

}
