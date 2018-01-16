package com.rainbow.stage.rb.uc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rainbow.stage.rb.uc.mapper.BaseUserMapper;
import com.rainbow.stage.rb.uc.model.BaseUser;
import com.rainbow.stage.rb.uc.service.BaseUserService;

@Service
@Transactional
public class BaseUserServiceImpl implements BaseUserService {

	@Autowired
	private BaseUserMapper baseUserMapper;

	@Override
	public String getUserName(int userId) {
		
		BaseUser baseUser = baseUserMapper.selectByPrimaryKey(userId);
		if(baseUser == null)
			return "";
		
		return baseUser.getName();
	}
}
