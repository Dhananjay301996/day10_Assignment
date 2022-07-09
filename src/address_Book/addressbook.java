package address_Book;

import java.util.*;

public class addressbook {
	static Scanner scan = new Scanner(System.in);

    LinkedList<contact> listData = new LinkedList();

    public void contactList() {
        System.out.println("Enter First Name");
        String firstName = scan.nextLine();

        System.out.println("Enter last Name");
        String lastName = scan.nextLine();

        System.out.println("Enter State Name");
        String state = scan.nextLine();

        System.out.println("Enter City Name");
        String city = scan.nextLine();

        System.out.println("Enter Address");
        String addressName = scan.nextLine();

        System.out.println("Enter phone Number");
        String phone = scan.nextLine();

        System.out.println("Enter email Address");
        String email = scan.nextLine();

        contact contactsList = new contact(firstName,lastName,state,city,addressName,phone,email);
        listData.add(contactsList);
    }
}

