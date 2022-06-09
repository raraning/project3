package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.HotelVO;

@Repository
public class HotelDAOImpl implements HotelDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.HotelMapper";

	@Override
	public void insertHotel(HotelVO hotel) {
		sqlSession.insert(namespace+".insertHotel",hotel);
	}

	@Override
	public void addAttack(String fullName, int h_uid) throws Exception {
		System.out.println(h_uid);
		
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("fullName", fullName);
		paramMap.put("h_uid", h_uid);
		
		sqlSession.insert(namespace+".addAttach",paramMap);
	}
	
	
}
