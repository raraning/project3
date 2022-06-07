package org.zerock.service;

import org.zerock.domain.HotelFileVO;
import org.zerock.domain.HotelVO;

public interface HotelService {
	
	public void regist(HotelVO hotel) throws Exception;
	public void registfile(HotelFileVO hotelfile) throws Exception;
}
