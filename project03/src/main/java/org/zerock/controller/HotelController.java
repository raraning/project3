package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.HotelVO;

@Controller
@RequestMapping("/hotel/*")
public class HotelController {
	
	private static final Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@GetMapping("/hotelmain")
	public void hotelmainGET() throws Exception{
		logger.info("hotelmain get=============");
	}
	
	@GetMapping("/hotelregist")
	public void hotelregistGET() throws Exception{
		logger.info("hotel regist get=============");
	}
	
}
