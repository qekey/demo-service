package dev.xwolf.demo.frq.entity;

import java.util.List;

public class Requiry {	
	
	private String id;
	
	private String pn;
	
	private String mfr;
	
	private int qty;
	
	private long price;
	
	private String delivery;
	
	private String mark;
	
	private String display="{display:'none'}";
	
	private List<Inventory> relevant;
	
	private String flag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public String getMfr() {
		return mfr;
	}

	public void setMfr(String mfr) {
		this.mfr = mfr;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public List<Inventory> getRelevant() {
		return relevant;
	}

	public void setRelevant(List<Inventory> relevant) {
		this.relevant = relevant;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	
	
	
	
	

}
