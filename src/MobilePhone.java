import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber,ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }
}