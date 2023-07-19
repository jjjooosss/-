package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.MemberVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO {
	public String insertMember(MemberVO vo) throws Exception {
		return (String) insert("memberDAO.insertMember", vo);
	}
	public MemberVO selectMember(MemberVO vo) throws Exception {
		return (MemberVO) select("memberDAO.selectMember", vo);
	}

}
