package egovframework.example.sample.service;

import java.util.List;

public interface ItemService {
	String insertItem(ItemVO vo) throws Exception;
	List<?> selectItemList(ItemVO vo) throws Exception;
}
