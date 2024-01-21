package HomeWork.Task1;

import java.util.Comparator;

public class ContactNumberComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact contact1, Contact contact2) {
        if (!contact1.getPhoneNumber().equals(contact2.getPhoneNumber())){
            System.out.println("number exist");
                    }
        return contact1.getPhoneNumber().compareTo(contact2.getPhoneNumber());
    }
}
