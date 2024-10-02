package com.VannamathiDressShop;

import java.sql.Connection;
import java.sql.DriverManager;

public class Detaildb {
    public Connection getDBConnection() {
    	Connection con=null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dressshop","root","");
    	}catch(Exception ex) {
    
    	System.out.println(ex);
    }
    return con;
}
}