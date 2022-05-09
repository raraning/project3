package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.service.MemberService;

@RestController
@RequestMapping("/member/")
public class MemberControllerRest {

private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService service;
	
	//@GetMapping("idok")
	public String idokPost(String id) {
		//logger.info("==id==:"+id);
		logger.info("======================test======================");
		return "aaa";
	}
}
