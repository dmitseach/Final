package com.qaprosoft.onliner.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.qaprosoft.onliner.mappers.FridgeMapper;
import com.qaprosoft.onliner.objects.Fridge;
import com.qaprosoft.onliner.utils.MyBatisUtil;

public class FridgeDAO implements FridgeMapper {

	public Fridge getFridgeById(Integer fridgeId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			FridgeMapper fridgeMapper = sqlSession.getMapper(FridgeMapper.class);
			return fridgeMapper.getFridgeById(fridgeId);
		} finally {
			sqlSession.close();
		}
	}

	public List<Fridge> getAllFridges() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			FridgeMapper fridgeMapper = sqlSession.getMapper(FridgeMapper.class);
			return fridgeMapper.getAllFridges();
		} finally {
			sqlSession.close();
		}
	}

}
