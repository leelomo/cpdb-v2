package hk.ed.cpdb.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

public class BaseDao{

	@Resource
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
