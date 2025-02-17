package ficha3.tests;
import ficha3.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ContactTestCase {
    @Test
    public void testCreateContact() {
        var contact = new Contact("foo", "bar", "912 345 678");
        assertEquals("foo", contact.getFirstName());
        assertEquals("bar", contact.getLastName());
        assertEquals("912 345 678", contact.getPhone());
    }
}
