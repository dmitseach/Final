package com.qaprosoft.onliner.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.qaprosoft.onliner.mappers.PhoneMapper;
import com.qaprosoft.onliner.objects.Phone;
import com.qaprosoft.onliner.utils.MyBatisUtil;

public class PhoneDAO implements PhoneMapper {

	public Phone getPhoneById(Integer phoneId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			PhoneMapper phoneMapper = sqlSession.getMapper(PhoneMapper.class);
			return phoneMapper.getPhoneById(phoneId);
		} finally {
			sqlSession.close();
		}
	}

	public List<Phone> getAllPhones() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			PhoneMapper phoneMapper = sqlSession.getMapper(PhoneMapper.class);
			return phoneMapper.getAllPhones();
		} finally {
			sqlSession.close();
		}
	}

}
