package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.HotelVO;
import org.zerock.service.HotelService;

@Controller
@RequestMapping("/hotel/*")
public class HotelController {
	
	private static final Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@Inject
	private HotelService service;
	
	@GetMapping("/hotelmain")
	public void hotelmainGET() throws Exception{
		logger.info("hotelmain get=============");
	}
	
	@GetMapping("/hotelregist")
	public void hotelregistGET() throws Exception{
		logger.info("hotel regist get=============");
	}
	
	@PostMapping("/hotelregist")
	public String hotelregistPOST(HotelVO hotel, RedirectAttributes rttr) throws Exception{
		logger.info("hotel regist post=============");
		logger.info(hotel.toString());
		
		service.regist(hotel);
		
		return"redirect:/";
	}
	
}
