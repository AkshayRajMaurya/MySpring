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
	public Users getRowById(int id) {
		return dataDao.getRowById(id);
	}

}
