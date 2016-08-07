package com.arm.services;

import java.util.List;

import com.arm.domain.Users;

public interface DataService {
	public int insertRow(Users users);

	public List getList();

	public Users getRowById(int id);

	public int updateRow(Users users);

	public int deleteRow(int id);

}