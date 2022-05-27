package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.HotelVO;
import org.zerock.persistence.HotelDAO;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Inject
	private HotelDAO dao;

	@Override
	public void regist(HotelVO hotel) throws Exception {
		dao.insertHotel(hotel);
		
		//∆ƒ¿œ√∑∫Œ
		String[] files = hotel.getFiles();
		
		if(files == null) { return; }
		
		for(String fileName:files) {
			dao.addAttack(fileName);
		}
	}
	
	
}
