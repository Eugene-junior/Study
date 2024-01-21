package HomeWork.Task1;

import java.util.*;

public class ContactApp {
    public static void main(String[] args) {
      Comparator<Contact> ContactComparator = new ContactNameComparator().thenComparing(new ContactNumberComparator());
      ContactManager contactManager = new ContactManager();

      Set<Contact>ContactList = new HashSet<>();

      contactManager.AddContact(ContactList, new Contact("Pavel","1111"));
      contactManager.AddContact(ContactList, new Contact("Oleg","1101"));
      contactManager.AddContact(ContactList, new Contact("Stepan","1110"));
      System.out.println("Our CONTACTLIST contains: " + ContactList);

      contactManager.RemoveContact(new Contact("Pavel","7777"));
      System.out.println(ContactList);
      


      System.out.println("Our CONTACTLIST contains: " + ContactList);










    }
}
