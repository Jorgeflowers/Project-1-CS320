/**
 * Jorge Flores
 * February 2025
 * ContactServiceTest.java
 */


package contact.test;

import contact.Contact;
import contact.ContactService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	private ContactService service;
	
	//BeforeEach
	public void setUp() {
}
	//Test
	public void testAddContact() {
		Contact contact = new Contact("123", "Jorge", "Flores", "1234567890", "123 Main St");
		service.addContact(contact);
		assertEquals(contact, service.getContact("123"));
	}
	
	//Test
	public void testDeleteContact() {
		Contact contact = new Contact("123", "Jorge", "Flores", "1234567890", "123 Main St");
		service.addContact(contact);
		service.deleteContact("123");
		assertNull(service.getContact("123"));
	}
	
	//Test
	public void testUpdateContact() {
		Contact contact = new Contact("123", "Jorge", "Flores", "1234567890", "123 Main St");
		service.addContact(contact);
		
		service.updateFirstName("123","John");
		service.updateLastName("123", "Doe");
		service.updatePhone("123", "0987654321");
		service.updateAddress("123", "456 Elm St");
		
		assertEquals("John", service.getContact("123").getFirstName());
		assertEquals("Doe", service.getContact("123").getLastName());
		assertEquals("0987654321", service.getContact("123").getPhone());
		assertEquals("456 Elm St", service.getContact("123").getAddress());
	}
}	
