package org.zerock.persistence;

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
	
	
}
