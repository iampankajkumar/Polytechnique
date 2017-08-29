package com.pankaj.dao;

import org.hibernate.Session;

import com.pankaj.dto.UserMaster;
import com.pankaj.util.HibernateUtils;

public class UserMgmtDao {

	public void registerUser(UserMaster userMaster) throws Exception{
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(userMaster);
		session.getTransaction().commit();
	}

}
