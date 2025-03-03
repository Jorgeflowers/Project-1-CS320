/**
 * Jorge Flores
 * February 2025
 * ContactService.java
 */


package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private final Map<String, Contact> contacts = new HashMap<>();
	
	// new contact
	public void addContact(Contact contact) {
		if (contact == null || contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact must be unique and not null.");
			}
		contacts.put(contact.getContactId(), contact);
	}
	
	// deletes the  contact id
	public void deleteContact(String contactId) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact id not found.");
		}
		contacts.remove(contactId);
	}
	
	// updates the firstName
	public void updateFirstName(String contactId, String firstName) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact Id not found.");
			}
			contacts.get(contactId).setFirstName(firstName);
	}
	// updates lastName
	public void updateLastName(String contactId, String lastName) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact Id not found.");
			}
			contacts.get(contactId).setLastName(lastName);
}
	// updates the Address
	public void updatePhone(String contactId, String phone) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact Id not found.");
		}
		contacts.get(contactId).setPhone(phone);
	}
	
	// updates the Address
	public void updateAddress(String contactId, String address) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact id not found.)");
		}
		contacts.get(contactId).setAddress(address);
	}
	
	// retrieves contact
	public Contact getContact(String contactId) {
		return contacts.get(contactId);
	}
	}
	



