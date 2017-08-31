package com.hdfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.hdfs.dao.UserMapper;
import com.hdfs.entity.User;
import com.hdfs.entity.UserExample;
import com.hdfs.entity.UserExample.Criteria;
import com.hdfs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper udao;
	public List login(User user) {	
	
		UserExample userExample=new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andNameEqualTo(user.getName());
		
		return udao.selectByExample(userExample);
	}

}
