import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    // Tests to see if we can create a new contact
    void testContact(){
        Contact contact = new Contact("222333444", "Amelia", "Majesto", "1111111111", "450 Bubblegum Rd");
        assertTrue(contact.getContactId().equals("222333444"));
        assertTrue(contact.getFirstName().equals("Amelia"));
        assertTrue(contact.getLastName().equals("Majesto"));
        assertTrue(contact.getPhone().equals("1111111111"));
        assertTrue(contact.getAddress().equals("450 Bubblegum Rd"));
    }

    @Test
    // Test to see if it throws an error if Id is too long
    void testIdLength(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("454545454545", "Amelia", "Majesto", "1111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if Id Null
    void testIdNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            new Contact(null, "Amelia", "Majesto", "1111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if first name is too long
    void testFirstNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "AmeliaAnnette", "Majesto", "1111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if first name is null
    void testFirstNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", null, "Majesto", "1111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if last name is too long
    void testLastNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "Amelia", "Majestofico", "1111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if last name is null
    void testLastNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "Amelia", null, "1111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if phone number is too long
    void testPhoneLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "Amelia", "Majesto", "111111111111", "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if phone number is null
    void testPhoneNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "Amelia", "Majesto", null, "450 Bubblegum Rd");
        });
    }

    @Test
        // Test to see if it throws an error if address is too long
    void testAddressLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "Amelia", "Majesto", "1111111111", "450454865 Bubblegum Candycane Road");
        });
    }

    @Test
        // Test to see if it throws an error if address is Null
    void testAddressNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("45454", "Amelia", "Majesto", "1111111111", null);
        });
    }

}