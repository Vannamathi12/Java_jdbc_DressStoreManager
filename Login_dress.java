package com.VannamathiDressShop;

public class Login_dress {
	String names;
	String password;
    public Login_dress() {
    	
    }
	public void setname(String name) {
		this.names=names;
	}
    public void setpassword(String password) {
    	this.password=password;
    }
    public String getname() {
    	return names;
    }
    public String getpassword() {
    	return password;
    }
    public Login_dress(String names,String password) {
    	super();
    	this.names=names;
    	this.password=password;
    }
    
	@Override
	public String toString() {
		return "Login_dress [name=" + names + ", password=" + password + "]";
	}
}
