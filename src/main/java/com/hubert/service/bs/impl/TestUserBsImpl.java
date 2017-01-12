package com.hubert.service.bs.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hubert.service.bs.TestUserBs;
import com.hubert.service.is.entity.TestUser;
import com.hubert.service.is.entity.TestUserExample;
import com.hubert.service.is.mapper.TestUserMapper;

@Service
public class TestUserBsImpl implements TestUserBs{
	
	@Autowired
	TestUserMapper testUserMapper;
	
	@Override
	public List<TestUser> queryTestUser() {
		TestUserExample example = new TestUserExample();
		return testUserMapper.selectByExample(example);
	}

}
