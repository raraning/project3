package org.zerock.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
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
	
	// 첨부파일 저장 경로
	// servlet-context.xml에 있는 bean id="uploadPath" 경로 매칭
	@Resource(name="uploadPath")
	private String uploadPath;
	
	@PostMapping("/hotelregist")
	public String hotelregistPOST(HotelVO hotel, MultipartFile[] file, RedirectAttributes rttr) throws Exception{
		logger.info("hotel regist post=============");
		logger.info(hotel.toString());
		
		logger.info("file.length : "+file.length);
		
		String savedName[] = new String[file.length];
		
		for(int i=0;i<file.length;i++) {
			
			if(file[i].getSize() > 0) {
				
				logger.info("originalName : "+file[i].getOriginalFilename());
				logger.info("size : "+file[i].getSize());
				logger.info("contentType : "+file[i].getContentType());
				
				Date today = new Date();
				SimpleDateFormat cal = new SimpleDateFormat("yyyyMMddhhmmss");
				String signdate = cal.format(today);
				
				savedName[i] = signdate+"_"+file[i].getOriginalFilename();
				byte[] fileData = file[i].getBytes();
				
				logger.info("savedName["+i+"] : "+savedName);
				
				File target = new File(uploadPath, savedName[i]);
				
				FileCopyUtils.copy(fileData, target);
			}
		}
		
		rttr.addFlashAttribute("savedName",savedName);
		
		hotel.setFiles(savedName);
		logger.info(hotel.toString());
		service.regist(hotel);
		
		return"redirect:/";
	}
	
	
}








