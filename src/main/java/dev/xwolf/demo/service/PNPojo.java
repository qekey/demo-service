package dev.xwolf.demo.service;

public class PNPojo {
	
	private String code;
	
	private String name;
	
	public PNPojo(String code,String name){
		this.name=name;
		this.code=code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
