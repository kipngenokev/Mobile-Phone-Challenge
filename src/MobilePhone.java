import java.util.ArrayList;

public class MobilePhone{

    public static void main(String[] args) {
        Contact contact = new Contact("Kev","0702922235");
        
    }
    private String myNumber;

    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber= myNumber;
        this.myContacts = new ArrayList<Contact>();

    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact updatedContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            return false;
        }else{
            myContacts.set(foundPosition,updatedContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            return false;
        }else {
            myContacts.remove(foundPosition);
            return true;
        }
    }

    private int findContact(Contact contact) {
        if(myContacts.indexOf(contact) >= 0 ) {
            return myContacts.indexOf(contact);
        }else {
            return -1;
        }

    }

    private int findContact(String contactName) {
        for(int i = 0; i<myContacts.size();i++) {
            if(myContacts.get(i).getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        int position = findContact(contactName);
        if(position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +" " +this.myContacts.get(i).getName() +" "+"->" + " "
                    + this.myContacts.get(i).getPhoneNumber());

        }
    }
}