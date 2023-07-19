package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.ItemService;
import egovframework.example.sample.service.ItemVO;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	
	@Resource(name = "itemService")
	private ItemService itemService;
	
	@RequestMapping(value = "/itemList.do")
	public String itemList(ItemVO vo, ModelMap model) throws Exception {
		
		List<?> list = itemService.selectItemList(vo);
		model.addAttribute("resultList", list);
		
		return "item/itemList";
	}
	
	@RequestMapping(value = "/itemWrite.do")
	public String itemWrite() throws Exception{
		return "item/itemWrite";
	}
	
	@RequestMapping(value = "/itemWriteSave.do")
	public String itemWriteSave(ItemVO vo) throws Exception {
		itemService.insertItem(vo);
		return "forward:/itemList.do";
	}
}
