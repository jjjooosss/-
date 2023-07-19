package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemberController {
	@Resource(name = "memberService")
	private MemberService memberService;
	
	@RequestMapping(value = "/register.do")
	public String register() {
		return "member/register";
	}
	
	
	@RequestMapping(value = "/registerOk.do")
	public String registerOk(MemberVO vo) throws Exception {
		memberService.register(vo);
		
		return "forward:/login.do";
	}
	
	@RequestMapping(value = "/login.do")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping(value = "/loginOk.do")
	public String loginOk(MemberVO vo, ModelMap model) throws Exception {

		int loginStatus = memberService.loginOk(vo);
		model.addAttribute("loginStatus", loginStatus);
		
		log.info("이거되냐?");
		if (loginStatus == 1) {
			log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@1");
			return "forward:/loginSuccess.do";
		} else {
			log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@그외");
			return "forward:/loginOk.do";
		}
//		return "member/loginOk";
	}	
	@RequestMapping(value = "/loginSuccess.do")
	public String loginSuccess() throws Exception {
		return "member/loginSuccess";
	}
}
