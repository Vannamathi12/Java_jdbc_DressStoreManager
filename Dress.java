package com.VannamathiDressShop;

public class Dress {
	private String name;
	private String id;
	private String type;
	private String size;
	private int price;
	//Dress dr=new Dress();
	public Dress() {}
	public Dress(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setid(String id) {
		this.id=id;
	}
	public void settype(String type) {
		this.type=type;
	}
	public void setsize(String size) {
		this.size=size;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public String getname() {
		return this.name;
	}
	public String getid() {
		return this.id;
	}
	public String gettype() {
		return this.type;
	}
	public String getsize() {
		return this.size;
	}
	public int getprice() {
		return this.price;
	}
	@Override
	public String toString() {
		return "Dress [name=" + name + ", id=" + id + ", type=" + type + ", size=" + size + ", price=" + price + "]";
	}
}
