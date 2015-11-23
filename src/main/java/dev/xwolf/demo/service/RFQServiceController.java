package dev.xwolf.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RFQServiceController {
	
	
	@RequestMapping(value = "/pn_list")
	@ResponseBody
	public List<String> pn(String pn){
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<5;i++){
			list.add(pn+"-"+i);
		}
		return list;
	}
	
	
	@RequestMapping(value = "/pn/list/")
	@ResponseBody
	public List<Map> product(){
		return null;
	}
	

}
