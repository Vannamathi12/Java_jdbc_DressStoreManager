package com.VannamathiDressShop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Inventary {
    Statement stmt;
    ResultSet rs;
    String qry=null;
    Detaildb db=new Detaildb();
    Connection con;
	String res;
	Scanner sc=new Scanner(System.in);
	Main m;
	List<Dress> list=new ArrayList<>();
	 public void add(Dress d) {
		boolean sts =false;
		int count;
		try {
			Connection con=db.getDBConnection();
			stmt=con.createStatement();
			qry="insert into dress(name,id,type,size,price) values('"+d.getname()+"','"+d.getid()+"','"+d.gettype()+"','"+d.getsize()+"','"+d.getprice()+"')";
			count=stmt.executeUpdate(qry);
			if(count==1)
				sts=true;
			else
				throw new Exception();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	} 
	 public void show1() {
		/*for(Dress d:list) {
			System.out.println(d);	
		}
		
	}*/
	 try {
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 rs=stmt.executeQuery("select * from dress");
		 while(rs.next())
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
	 }
	 catch (Exception ex) {
		 System.out.println(ex.getMessage());
	 }
	 }
	 public Dress Search(String d1) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getid().equals(d1))
				return (list.get(i));
		}
		return null;
	}
	 public void update(Dress d) {
		 int count;
		 boolean sts =false;
		 try {
			 con=db.getDBConnection();
			 stmt=con.createStatement();
			 count=stmt.executeUpdate("Update dress set name='"+d.getname()+"' where id='"+d.getid()+"'");
			 if(count==1)
					sts=true;
				else
					throw new Exception();
		 }
		 catch(Exception ex) {
			 System.out.println(ex.getMessage());
		 }
		 
		System.out.println("Successful");
	}
	 public void remove(String d2) {
		//for(int i=0;i<list.size();i++) {
			//if(list.get(i).getid().equals(d2))
				//list.remove(i);	
		 int count;
		 boolean sts =false;
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			qry="delete from dress where id='"+d2+"'";
			count=stmt.executeUpdate(qry);
			if(count==1)
				sts=true;
			}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		}
	 
	 public void logout() {
		 m.main(null);
		 
	 }
}

