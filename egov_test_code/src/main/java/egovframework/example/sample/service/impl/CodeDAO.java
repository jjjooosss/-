package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CodeVO;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("codeDAO")
public class CodeDAO extends EgovAbstractDAO{

	public String insertCode(CodeVO vo) throws Exception {
		return (String) insert("codeDAO.insertCode", vo);
	}
	
	public List<?> selectCodeList(CodeVO vo) throws Exception {
		return list("codeDAO.selectCodeList",vo);
	}
	public CodeVO selectCode(int code) throws Exception{
		return (CodeVO) select("codeDAO.selectCode",code);
	}
	public int selectCount() throws Exception{
		return (Integer) select("codeDAO.selectCount");
	}
	public void deleteCode(int code) throws Exception {
		delete("codeDAO.deleteCode", code);
	}
	public void updateCode(CodeVO vo) throws Exception {
		update("codeDAO.updateCode", vo);
	}
}
