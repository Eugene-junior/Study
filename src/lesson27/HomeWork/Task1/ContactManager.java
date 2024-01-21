package HomeWork.Task1;

import java.util.*;

public class ContactManager implements Comparator<Contact> {
    Set<Contact> OurContacts = new HashSet<>();

    public void AddContact(Set<Contact> OurContacts, Contact contact) {
        for (Contact NewContact : OurContacts) {
            if (NewContact.getName().equals(contact.getName())) {
                System.out.println("NAME ERROR - this name (" + contact.getName() + ")  is already exist");
                break;
            }

            if (NewContact.getPhoneNumber().equals(contact.getPhoneNumber())) {
                System.out.println("NUMBER ERROR - this number (" + contact.getPhoneNumber() + ") is already exist");
                break;
            }
        }
        OurContacts.add(contact);
    }

    public Contact contactForDelete(Contact contact) {
               return contactForDelete(contact);
    }

    {

    }



    public void RemoveContact(Contact contact) {
        for (Contact contactForDelete : OurContacts){
            if (!contactForDelete.equals(contact)){
                System.out.println("Not exist");}
            else {OurContacts.remove(contactForDelete);}


        }

                }






    public ContactManager() {
        this.OurContacts = new HashSet<>();
    }

    @Override
    public int compare(Contact o1, Contact o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "ContactManager{" +
                "OurContacts=" + OurContacts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactManager that = (ContactManager) o;
        return Objects.equals(OurContacts, that.OurContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(OurContacts);
    }
}


