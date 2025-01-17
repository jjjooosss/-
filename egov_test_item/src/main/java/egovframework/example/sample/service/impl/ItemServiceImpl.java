package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.ItemService;
import egovframework.example.sample.service.ItemVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("itemService")
public class ItemServiceImpl extends EgovAbstractServiceImpl implements ItemService {

	@Resource(name = "itemDAO")
	private ItemDAO itemDAO;
		
	@Override
	public String insertItem(ItemVO vo) throws Exception {
		// TODO Auto-generated method stub
		return itemDAO.insertItem(vo);
	}

	@Override
	public List<?> selectItemList(ItemVO vo) throws Exception {
		return itemDAO.selectItemList(vo);
	}
	

}
