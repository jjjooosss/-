package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;


//@Service("deptService"): 컨트롤러에서 deptService로 연결
@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService {

//	@Resource(name = "deptDAO") : deptDAO 이름으로 dao 사용(ibatis방식, mybatis는 매퍼)
	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		return deptDAO.inserDept(vo);
	}
	@Override
	public List<?> selectDeptList(DeptVO vo) throws Exception {
		return deptDAO.selectDeptList(vo);
	}
	@Override
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		return deptDAO.selectDeptDetail(deptno);
	}
	@Override
	public void deleteDept(int deptno) throws Exception {
		deptDAO.deleteDept(deptno);
	}
	@Override
	public void updateDept(DeptVO vo) throws Exception {
		deptDAO.updateDept(vo);
	}
}
