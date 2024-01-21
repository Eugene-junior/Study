package HomeWork.Task1;

import java.util.Comparator;

public class ContactNameComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact contact1, Contact contact2) {
        boolean AlreadyExist = false;
         if (contact1.getName().equals(contact2.getName())) {
            System.out.println("Contact with this name is already exist");
            AlreadyExist = true;
                               }
        return contact1.getName().compareTo(contact2.getName());
    }
}
