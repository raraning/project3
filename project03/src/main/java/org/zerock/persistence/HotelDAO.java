package org.zerock.persistence;

import org.zerock.domain.HotelVO;

public interface HotelDAO {
	
	public void insertHotel(HotelVO hotel);
	public void addAttack(String fullName) throws Exception;
}
