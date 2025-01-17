package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Service("codeService")
@Slf4j
public class CodeServiceImpl extends EgovAbstractServiceImpl implements CodeService {

	@Resource(name = "codeDAO")
	private CodeDAO codeDAO;
	
	@Override
	public String insertCode(CodeVO vo) throws Exception {
		log.info("-----codeService insertCode-----");
		codeDAO.insertCode(vo);
		return null;
	}

	@Override
	public List<?> selectCodeList(CodeVO vo) throws Exception {
		log.info("-----codeService selectCode-----");
		return codeDAO.selectCodeList(vo);
	}

	@Override
	public CodeVO selectCode(int code) throws Exception {
		return codeDAO.selectCode(code);
	}
	
	@Override
	public int selectCount() throws Exception {
		return codeDAO.selectCount();
	}

	@Override
	public void deleteCode(int code) throws Exception {
		codeDAO.deleteCode(code);
	}

	@Override
	public void updateCode(CodeVO vo) throws Exception {
		codeDAO.updateCode(vo);
	}



}
