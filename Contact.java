/**
 * Jorge Flores
 * February 2025
 * Contact.java
 */

package contact;

public class Contact {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Contact ID must be null and cannot exceed 10 characters.");
			}
		this.contactId = contactId;
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
		}
	
	public String getContactId() { return contactId; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getPhone() { return phone; }
	public String getAddress() {return address; }

	// setters with validation
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name must not be null and cannot exceed 10 characters.");
			}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last name must not be null and cannot exceed 10 characters.");
			}
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
			throw new IllegalArgumentException("Phone must be exactly 10 digits.");
			}
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address must not be null and cannot exceed 30 characters.");
			}
		this.address = address;
	}
}
