package com.arm.services;

import java.util.List;

import com.arm.domain.Users;

public interface DataService {
	public int insertRow(Users users);

	public Users getRowById(int id);

}
