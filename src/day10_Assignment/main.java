package day10_Assignment;

import java.util.HashMap;
import java.util.Map;


public class main {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Address Book Main Program");

	        addressbook a1 = new addressbook();
	        a1.contactList();
	        a1.contactList();
	        a1.contactList();
	        System.out.println(a1.listData);

	      /*  System.out.println("if you want to change person Name , reply yes/no : ");
	        String check = addressbook.scan.nextLine();

	        System.out.println("enter name whose details you want to edit : ");
	        String name = addressbook.scan.nextLine();

	        if (check.equals("yes")) {
	            for (contact cThrough : a1.listData) {

	                if (cThrough.getFirstName().equals(name)) {
	                    System.out.println("enter updated phone number : ");
	                    cThrough.setPhone(addressbook.scan.next());
	                    break;
	                }
	            }
	        }
	        System.out.println(a1.listData);
	    }*/
		
		 System.out.println("if you want to change any data of a person, reply yes/no : ");
	        String check = addressbook.scan.nextLine();


	        if (check.equals("yes")) {
	            System.out.println("enter name whose details you want to edit : ");
	            String name = addressbook.scan.nextLine();

	            int i =0;
	            for (contact cThrough : a1.listData) {

	                if (cThrough.getFirstName().equals(name)) {
	                    a1.listData.remove(i);
	                    break;
	                }
	                i++;
	            }
	        }
	        
	        System.out.println(a1.listData);
	        
	       
	        System.out.println("if you want to change any data of a person, reply y/n : ");
	        check = addressbook.scan.nextLine();

	        if (check.equals("y")) {

	            System.out.println("enter name whose details you want to edit : ");
	            String name = addressbook.scan.nextLine();

	            for (contact cThrough : a1.listData) {

	                if (cThrough.getFirstName().equals(name)) {
	                    System.out.println("enter updated phone number : ");
	                    cThrough.setPhone(addressbook.scan.next());
	                    break;
	                }
	            }
	        }

	        Map<String, addressbook> map = new HashMap<>();
	        map.put("1",a1);
	        map.get(a1);
	    }
	   }
	   	
