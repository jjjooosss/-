package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DeptController {
	
//	@Resource(name = "deptService") : DeptServiceImpl에 @Service로 연결
	@Resource(name = "deptService")
	private DeptService deptService;
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	@RequestMapping(value = "/deptWriteSave.do")
//	public String deptWriteSave(String deptno, String dname, String loc) {
	public String deptWriteSave(DeptVO vo) throws Exception {
//		log.info("부서번호 : "+deptno);
//		log.info("부서이름 : "+dname);
		log.info("부서번호 : "+vo.getDeptno());
		log.info("부서이름 : "+vo.getDname());
		log.info("부서위치 : "+vo.getLoc());
		
		String result = deptService.insertDept(vo);
		log.info("@# result ===>"+ result);
		
		return "forward:/deptList.do";
	}
	
	@RequestMapping(value = "/deptList.do")
//	ModelMap : 전자정부 프레임워크는 model의 이름이 다르다
	public String selectDeptList(DeptVO vo, ModelMap model) throws Exception {
		
		List<?> list = deptService.selectDeptList(vo);
		log.info("@# list=>"+list);
		model.addAttribute("resultList", list);
		
		return "dept/deptList";
	}
	

	@RequestMapping(value = "/deptDetail.do")
//	ModelMap : 전자정부 프레임워크는 model의 이름이 다르다
	public String selectDeptDetail(int deptno, ModelMap model) throws Exception {
		
		DeptVO vo = deptService.selectDeptDetail(deptno);
		log.info("@# vo=>"+vo);
		model.addAttribute("deptVO", vo);
		
		return "dept/deptDetail";
	}
	
	@RequestMapping("/deptDelete.do")
	public String deleteDept(int deptno) throws Exception {
		deptService.deleteDept(deptno);
//		forward: 전자정부 프레임워크에서의 redirect
		return "forward:/deptList.do";
	}
	
	@RequestMapping(value = "/deptModify.do")
//	ModelMap : 전자정부 프레임워크는 model의 이름이 다르다
	public String deptModify(int deptno, ModelMap model) throws Exception {
		
		DeptVO vo = deptService.selectDeptDetail(deptno);
		model.addAttribute("deptVO", vo);
		
		return "dept/deptModify";
	}

	@RequestMapping("/deptModifySave.do")
	public String updateDept(DeptVO vo) throws Exception {
		deptService.updateDept(vo);
		return "forward:/deptList.do";
	}

}
