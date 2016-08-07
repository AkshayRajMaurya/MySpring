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
	public List getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List usersList = session.createQuery("from Users")
		.list();
		session.close();
		return usersList;
	}

	@Override
	public Users getRowById(int id) {
		Session session = sessionFactory.openSession();
		Users users = (Users) session.load(Users.class, id);
		return users;
	}

	@Override
	public int updateRow(Users users) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(users);
		tx.commit();
		Serializable id = session.getIdentifier(users);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Users users = (Users) session.load(Users.class, id);
		session.delete(users);
		tx.commit();
		Serializable ids = session.getIdentifier(users);
		session.close();
		return (Integer) ids;
	}

}