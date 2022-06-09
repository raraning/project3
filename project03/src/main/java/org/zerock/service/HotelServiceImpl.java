package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.HotelFileVO;
import org.zerock.domain.HotelVO;
import org.zerock.persistence.HotelDAO;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Inject
	private HotelDAO dao;
	
	@Transactional
	@Override
	public void regist(HotelVO hotel) throws Exception {
		dao.insertHotel(hotel);
		
		
	}

	@Override
	public void registfile(HotelFileVO hotelfile, int h_uid) throws Exception {
		//����÷��
				String[] files = hotelfile.getFiles();
				
				System.out.println(hotelfile);
				
				if(files == null) { return; }
				
				for(String fileName:files) {
					dao.addAttack(fileName,h_uid);
				}
	}
	
	
	
}
