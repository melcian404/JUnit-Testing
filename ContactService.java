import java.util.Map;
import java.util.HashMap;
public class ContactService {
    private Map<String, Contact> contacts;
    // Hash map to store values in key and value pairs.
    public ContactService(){
        this.contacts = new HashMap<>();
    }
    // Add contact method
    public void addContact(Contact contact){
        contacts.put(contact.getContactId(), contact);
    }

    // Delete contact method
    public void delContact(String contactId){
        contacts.remove(contactId);
    }

    // Update First Name Method
    public void updateFirstName(String contactId, String firstName){
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setFirstName(firstName);
        }
    }

    // Update last name method
    public void updateLastName(String contactId, String lastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setLastName(lastName);
        }
    }

    // Update phone number method
    public void updatePhone(String contactId, String phone) {
        Contact contact = contacts.get(contactId);
        if (contact != null){
            contact.setPhone(phone);
        }

    }

    // Update address method
    public void updateAddress(String contactId, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setAddress(address);
        }
    }

    public Contact getContact(String contactId){
        return contacts.get(contactId);
    }
}
