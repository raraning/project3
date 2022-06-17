package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.HotelVO;

public interface HotelDAO {
	
	public void insertHotel(HotelVO hotel);
	public void addAttack(String fullName, int h_uid) throws Exception;
	public List<HotelVO> listHotel() throws Exception;
	public List<HotelVO> listPension() throws Exception;
}
