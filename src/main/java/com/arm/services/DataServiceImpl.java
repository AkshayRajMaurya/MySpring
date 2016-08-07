package com.arm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arm.dao.DataDao;
import com.arm.domain.Users;

public class DataServiceImpl implements DataService {

	@Autowired
	DataDao dataDao;

	@Override
	public int insertRow(Users users) {
		return dataDao.insertRow(users);
	}

	@Override
	public List getList() {
		return dataDao.getList();
	}

	@Override
	public Users getRowById(int id) {
		return dataDao.getRowById(id);
	}

	@Override
	public int updateRow(Users users) {
		return dataDao.updateRow(users);
	}

	@Override
	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

}