package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService service;
	
	@GetMapping("/memberjoin")
	public void joinGET(MemberVO member) throws Exception{
		logger.info("join get================");
	}
	
	@PostMapping("/memberjoin")
	public String joinPOST(MemberVO member, RedirectAttributes rttr) throws Exception{
		logger.info("join post==============");
		logger.info(member.toString());
		
		service.regist(member);
		
		return"redirect:/";
	}
	
	@GetMapping("/agreement")
	public void agreementGET(MemberVO member) throws Exception{
		logger.info("agreement get==============");
	}
}
