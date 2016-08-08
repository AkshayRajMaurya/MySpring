package com.arm.dao;

import java.util.List;

import com.arm.domain.Users;

public interface DataDao {
	public int insertRow(Users users);

	public Users getRowById(int id);

}
