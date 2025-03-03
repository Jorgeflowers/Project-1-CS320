# Project-1-CS320

-How can I ensure that my code, program, or software is functional and secure?

a. Ensuring functionality and security in software requires thorough testing, proper design, and adherence to best practices. In my Contact.java and related service and test files, I implemented unit tests using JUnit to validate core functionalities such as creating, updating, and deleting contact records. By running automated tests, I was able to catch errors early and verify that methods performed as expected. Additionally, secure coding practices, such as input validation and constraints on contact attributes (e.g., limiting ID and name lengths), help prevent invalid data entry and potential security risks.

-How do I interpret user needs and incorporate them into a program?

a. Interpreting user needs involves analyzing requirements and translating them into functional software components. For the Contact Service implementation, I considered how users would interact with the system—ensuring they could add, update, and delete contacts efficiently. The design included clear constraints, such as ensuring unique contact IDs and restricting field lengths, to align with realistic user expectations. By structuring the service to handle data validation and integrity, I ensured the program met user needs while maintaining reliability.

-How do I approach designing software?

a. My approach to software design follows modularity, scalability, and maintainability principles. In my ContactService.java, I separated concerns by handling contact management in a dedicated class, making the program easier to maintain and extend. Additionally, I wrote unit tests (ContactServiceTest.java) to validate functionality and ensure that updates would not break existing features. This test-driven approach allows me to refine my code iteratively, improving quality and reliability. By applying object-oriented principles, such as encapsulation and separation of concerns, I ensure that my code remains structured and adaptable for future enhancements.
