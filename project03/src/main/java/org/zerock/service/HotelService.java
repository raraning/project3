package org.zerock.service;

import java.util.List;

import org.zerock.domain.HotelFileVO;
import org.zerock.domain.HotelVO;

public interface HotelService {
	
	public void regist(HotelVO hotel) throws Exception;
	public void registfile(HotelFileVO hotelfile, int h_uid) throws Exception;
	public List<HotelVO> listHotel() throws Exception;
}
