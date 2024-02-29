import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ContactServiceTest {

    private ContactService contactService;

    @BeforeEach
    public void setUp(){
        contactService = new ContactService();
    }

    @Test
    // Test to see we can add contact
    public void testAddContact(){
        Contact contact = new Contact("404", "Steven","Rogers","1777222333", "569 Leaman Place");
        contactService.addContact(contact);

        // Test to confirm contact added
        Contact searchAddContact = contactService.getContact("404");
        Assertions.assertEquals(contact, searchAddContact);
    }

    @Test
    // Test to see we can delete contact
    public void testDelContact(){
        Contact contact = new Contact ("405", "Bruce", "Banner", "1888555444", "1 Stark Tower Pl");
        contactService.addContact(contact);
        contactService.delContact("405");

        // Test to confirm contact deleted
        Contact searchDelContact = contactService.getContact("405");
        Assertions.assertNull(searchDelContact);
    }


    @Test
    // Test to see if we can update first name
    public void testUpdateFirstName(){
        Contact contact = new Contact("407", "Natalia", "Romanova", "1555444555", "45 North Shore Rd");
        contactService.addContact(contact);
        contactService.updateFirstName("407","Black");

        Contact searchUpdateFirstName = contactService.getContact("407");
        Assertions.assertEquals("Black", searchUpdateFirstName.getFirstName());

    }

    @Test
    // Test to see if we can update last name
    public void testUpdateLastName(){
        Contact contact = new Contact("408", "Black", "Romanova", "1555444555", "45 North Shore Rd");
        contactService.addContact(contact);
        contactService.updateLastName("408", "Widow");

        Contact searchUpdateLastName = contactService.getContact("408");
        Assertions.assertEquals("Widow", searchUpdateLastName.getLastName());

    }

    @Test
    // Test to see if we can update phone number
    public void testUpdatePhone(){
        Contact contact = new Contact("409", "Black", "Widow", "1555444555", "45 North Shore Rd");
        contactService.addContact(contact);
        contactService.updatePhone("409","1888888888");

        Contact searchUpdatePhone = contactService.getContact("409");
        Assertions.assertEquals("1888888888", searchUpdatePhone.getPhone());
    }

    @Test
    // Test to see if we can update address
    public void testUpdateAddress(){
        Contact contact = new Contact("410", "Black", "Widow", "1888888888", "45 North Shore Rd");
        contactService.addContact(contact);
        contactService.updateAddress("410","18 red dr");

        Contact searchUpdateAddress = contactService.getContact("410");
        Assertions.assertEquals("18 red dr", searchUpdateAddress.getAddress());

    }
}