package com.arm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.arm.domain.Users;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(Users users) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(users);
		tx.commit();
		Serializable id = session.getIdentifier(users);
		session.close();
		return (Integer) id;
	}

	@Override
	public Users getRowById(int id) {
		Session session = sessionFactory.openSession();
		Users users = (Users) session.load(Users.class, id);
		return users;
	}

}
