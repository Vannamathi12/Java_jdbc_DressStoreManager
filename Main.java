package com.VannamathiDressShop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{ 
		Inventary in= new Inventary();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String names=(sc.next()+sc.nextLine());
		System.out.println("Enter the password");
		String password=(sc.next()+sc.nextLine());
		Dress d=new Dress();
		int opt;
		//Dress dr=new Dress();
		Login1_dress v=new Login1_dress();
		Login_dress a=new Login_dress(names,password);
		if(v.admin(a)) {
		do {
			System.out.println("****************");
			System.out.println("1.Add 2.Update 3.Search 4.remove 5.Show");
			System.out.println("Enter the option:");
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Enter the id");
				d.setid(sc.next()+sc.nextLine());
				System.out.println("Enter the name:");
			    d.setname(sc.next()+sc.nextLine());
			    System.out.println("Enter the type");
				d.settype(sc.next()+sc.nextLine());
				System.out.println("Enter the size");
				d.setsize(sc.next()+sc.nextLine());
				System.out.println("Enter the price");
				d.setprice(sc.nextInt());
				in.add(d);
				break;
			case 2:
				System.out.println("Enter the items to be updated");
				System.out.println("Enter the id");
				String id=sc.next();
				d.setid(id);
				System.out.println("Enter the name");
				d.setname(sc.next()+sc.nextLine());
				in.update(d);
				break;

			case 3:
				System.out.println("Enter the item to be searched");
                String d1=sc.next()+sc.nextLine();
				d=in.Search(d1);
				System.out.println(d);
				break;

			case 4:
				System.out.println("Enter the item to be removed");
				System.out.println("Enter the id:");
                String d2=sc.next()+sc.nextLine();
                in.remove(d2);
				break;

			case 5:
                in.show1();
				break;
			case 6:
				in.logout();
				break;

			}
		}while(opt!=7);
        sc.close();
	} 
		in.show1();
	}
}