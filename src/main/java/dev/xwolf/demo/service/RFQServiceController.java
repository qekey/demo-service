package dev.xwolf.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.xwolf.demo.frq.entity.Inventory;
import dev.xwolf.demo.frq.entity.Requiry;

@Controller
public class RFQServiceController {
	
	@RequestMapping(value = "/api/requiry_list/requiry_id")
	@ResponseBody
	public List<Requiry> requiryList() {

		List<Requiry> list = new ArrayList<Requiry>();
		Requiry r = new Requiry();
		r.setPn("max232-1");
		r.setQty(1000);
		r.setDelivery("2015-12-21");
		r.setMark("urgent");
		list.add(r);
		
	   r = new Requiry();
		r.setPn("1n4148");
		r.setQty(2000);
		r.setDelivery("2015-12-25");
		r.setMark("urgent");
		list.add(r);
		
		 r = new Requiry();	
		 r.setFlag("init");
		 list.add(r);
		return list;

	}
	
	@RequestMapping(value = "/api/inventory/find")
	@ResponseBody
	public List<Inventory> relevantInventory(String pn) {

		List<Inventory> list = new ArrayList<Inventory>();
		Inventory i = new Inventory();
		i.setPn(pn);
		i.setMfr("tyco--"+pn);
		i.setQty(1000);
		list.add(i);
		i = new Inventory();
		i.setPn(pn);
		i.setMfr("intel--"+pn);
		i.setQty(1000);
		list.add(i);
		i = new Inventory();
		i.setPn(pn);
		i.setMfr("max-"+pn);
		i.setQty(1000);
		list.add(i);
		return list;
	}
	
	
	
	
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
			map.put("code", "1");
			map.put("name", "max-"+pn);
			
			list.add(map);
			 map=new HashMap();
			map.put("code", "2");
			map.put("name", "intel-"+pn);
			
			list.add(map);
			 map=new HashMap();
			map.put("code", "3");
			map.put("name", "lenvo-"+pn);
			
			list.add(map);
		
		return list;
	}
	
	@RequestMapping(value = "/api/mfrs/search/all")
	@ResponseBody
	public List<Map> getMfrsAll(String pn){
		List<Map> list=new ArrayList<Map>();
		
			Map map=new HashMap();
			map.put("code", "1");
			map.put("name", pn+"-max");
			
			list.add(map);
			 map=new HashMap();
			map.put("code", "2");
			map.put("name", pn+"intel");
			
			list.add(map);
			 map=new HashMap();
			map.put("code", "3");
			map.put("name", pn+"-lenvo");
			
			list.add(map);
		
		return list;
	}
	

}
