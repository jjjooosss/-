package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService {
	
	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;
	
	@Override
	public int loginOk(MemberVO vo) throws Exception {
		MemberVO selected = memberDAO.selectMember(vo);
        String userPwd = vo.getMem_pwd();
        int re = -1;
        if (selected != null){
            String queryPwd = selected.getMem_pwd();
            re = (userPwd.equals(queryPwd))? 1:0;
        }
        return re;
	}

	@Override
	public void register(MemberVO vo) throws Exception {
		memberDAO.insertMember(vo);
	}
	
	
}
