/**
 * Author: Jorge Flores
 * Date: February 2025
 * ContactTest.java // updated from module 3 based on feedback
 */

package contact.test;

import contact.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ContactTest {

    // Test valid contact creation
    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("1234", "Jorge", "Flores", "1234567890", "123 Main St");
        Assertions.assertEquals("1234", contact.getContactId());
        Assertions.assertEquals("Jorge", contact.getFirstName());
        Assertions.assertEquals("Flores", contact.getLastName());
        Assertions.assertEquals("1234567890", contact.getPhone());
        Assertions.assertEquals("123 Main St", contact.getAddress());
    }

    // Test invalid contact ID (null or exceeding length limit)
    @Test
    public void testInvalidContactId() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            new Contact(null, "Jorge", "Flores", "1234567890", "123 Main St"));
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            new Contact("12345678901", "Jorge", "Flores", "1234567890", "123 Main St"));
    }

    // Tests the invalid phone number (non-numeric or incorrect length) //
    @Test
    public void testInvalidPhoneNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            new Contact("123", "Jorge", "Flores", "12345", "123 Main St")); 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            new Contact("123", "Jorge", "Flores", "abcdefghij", "123 Main St")); 
    }

    // Tests address exceeding 30 character limit
    @Test
    public void testContactAddressMoreThan30Characters() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            new Contact("0123456789", "John", "Doe", "5555555555", 
                        "123 Main St 123 Main St 123 Main St 123 Main St")); 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("0123456789", "John", "Doe", "5555555555", "123 Main St");
            contact.setAddress("123 This Is A Really Long Street Name Street"); 
        });
    }

    // Tests the address null check //
    @Test
    public void testContactAddressNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            new Contact("0123456789", "John", "Doe", "5555555555", null)); 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Contact contact = new Contact("0123456789", "John", "Doe", "5555555555", "123 Main St");
            contact.setAddress(null); 
        });
    }
}
