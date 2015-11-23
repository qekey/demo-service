package dev.xwolf.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RFQServiceController {
	
	
	@RequestMapping(value = "/api/pn_list/find")
	@ResponseBody
	public List<Map> pn1(String pn){
		
		List<Map> list=new ArrayList<Map>();
		for(int i=0;i<5;i++){
			Map m=new HashMap();
			m.put("name", pn+"-"+i);
			m.put("code", pn+"-"+i);
			list.add(m);
		}
		return list;
	}
	
	@RequestMapping(value = "/api/pn_list/fin")
	@ResponseBody
	public List<PNPojo> pn(String pn){
		
		List<PNPojo> list=new ArrayList<PNPojo>();
		for(int i=0;i<5;i++){
			PNPojo pojo=new PNPojo( pn+"-"+i, pn+"-"+i);
			
			list.add(pojo);
		}
		return list;
	}
	
	@RequestMapping(value = "/find")
	@ResponseBody
	public List<String> find(String pn){
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<5;i++){
			list.add(pn+"-"+i);
		}
		return list;
	}
	
	
	@RequestMapping(value = "/api/mfrs/search")
	@ResponseBody
	public List<Map> getMfrs(String pn){
		List<Map> list=new ArrayList<Map>();
		
			Map map=new HashMap();
			map.put("id", "1");
			map.put("name", "max-"+pn);
			
			list.add(map);
			 map=new HashMap();
			map.put("id", "2");
			map.put("name", "intel-"+pn);
			
			list.add(map);
			 map=new HashMap();
			map.put("id", "3");
			map.put("name", "lenvo-"+pn);
			
			list.add(map);
		
		return list;
	}
	

}
