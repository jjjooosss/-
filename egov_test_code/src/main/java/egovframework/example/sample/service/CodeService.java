package egovframework.example.sample.service;

import java.util.List;

public interface CodeService {
	
	String insertCode(CodeVO vo) throws Exception;
	List<?> selectCodeList(CodeVO vo) throws Exception;
	CodeVO selectCode(int code) throws Exception;
	int selectCount() throws Exception;
	void deleteCode(int code) throws Exception;
	void updateCode(CodeVO vo) throws Exception;
	
}
