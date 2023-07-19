package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.ItemVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("itemDAO")
public class ItemDAO extends EgovAbstractDAO {

	public String insertItem(ItemVO vo) throws Exception {
		return (String) insert("itemDAO.insertItem", vo);
	}
	
	public List<?> selectItemList(ItemVO vo) throws Exception {
		return list("itemDAO.selectItem", vo);
	}
	
	
}
