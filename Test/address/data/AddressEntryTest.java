package address.data;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;


class AddressEntryTest {


    @Test
    void testToString() {
        AddressBook TestAB = new AddressBook();
        AddressEntry temp1 = new AddressEntry("Adrian","Ramos","1901 Harder Rd.","Hayward","California",94540,"555-555-5555","aramos110@horizon.csueastbay.edu");
        TestAB.add(temp1);

    }

    @Test
    void testSetFirstName() throws NoSuchFieldException, IllegalAccessException{
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setFirstName("Adrian");
        assertEquals("Adrian", TestAE.getFirstName());

    }

    @Test
    void testGetFirstName() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setFirstName("Adrian");
        assertEquals("Adrian", TestAE.getFirstName());
    }

    @Test
    void testSetLastName() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setLastName("Ramos");
        assertEquals("Ramos", TestAE.getLastName());
    }

    @Test
    void testGetLastName() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setLastName("Ramos");
        assertEquals("Ramos", TestAE.getLastName());
    }

    @Test
    void testSetStreet() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setStreet("1901 Harder Rd.");
        assertEquals("1901 Harder Rd.", TestAE.getStreet());
    }

    @Test
    void testGetStreet() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setStreet("1901 Harder Rd.");
        assertEquals("1901 Harder Rd.", TestAE.getStreet());
    }

    @Test
    void testSetCity() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setCity("Hayward");
        assertEquals("Hayward", TestAE.getCity());
    }

    @Test
    void testGetCity() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setCity("Hayward");
        assertEquals("Hayward", TestAE.getCity());
    }

    @Test
    void testSetState() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setState("California");
        assertEquals("California", TestAE.getState());
    }

    @Test
    void testGetState() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setState("California");
        assertEquals("California", TestAE.getState());
    }

    @Test
    void testSetZip() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setZip(94509);
        assertEquals(94509, TestAE.getZip());
    }

    @Test
    void testGetZip() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setZip(94509);
        assertEquals(94509, TestAE.getZip());
    }

    @Test
    void testSetPhone() {

        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setPhone("555-555-5555");
        assertEquals("555-555-5555", TestAE.getPhone());
    }

    @Test
    void testGetPhone() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setPhone("555-555-5555");
        assertEquals("555-555-5555", TestAE.getPhone());
    }

    @Test
    void testSetEmail() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setEmail("aramos110@horizon.csueastbay.edu");
        assertEquals("aramos110@horizon.csueastbay.edu", TestAE.getEmail());
    }

    @Test
    void testGetEmail() {
        AddressBook TestAB = new AddressBook();
        AddressEntry TestAE = new AddressEntry();
        TestAE.setEmail("aramos110@horizon.csueastbay.edu");
        assertEquals("aramos110@horizon.csueastbay.edu", TestAE.getEmail());
    }
}