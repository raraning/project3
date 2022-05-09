package org.zerock.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/login")
	public void loginGET(MemberVO member) throws Exception{
		logger.info("login get==============");
	}
	
	@PostMapping("/idcheck")
	public String idcheckPOST(MemberVO member, RedirectAttributes rttr) throws Exception{
		logger.info("idcheck post================");
		logger.info(member.toString());
		
		return"redirect:/member/memberjoin";
	}
	
	@RequestMapping(value="/idok", produces="text/plain;charset=UTF-8")
	public @ResponseBody String idCheck(String id) throws NumberFormatException, Exception {
		logger.info(id);
		
		int num = Integer.parseInt(service.idCheck(id));
		
		logger.info(service.idCheck(id));
		
		String result = "";
		
		if(num == 0) {
			result = "사용할 수 있는 아이디입니다.";
		}else {
			result = "존재하는 아이디입니다.";
		}
		
		return result;
	}
}







