package hospital.testCases;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hospital.entities.Person;

public class PersonTest {

	private Person person;
	
	@BeforeEach
	void setUp() {
		//Initialize a Person object before each test
		person = new Person("John Doe", 30, 1);
	}
	
	@Test
	void testConstructor() {
		//Test if the constructor initializes the Person object
		assertNotNull(person, "Person object should be created.");
		assertEquals("John Doe", person.getName(), "Name should be 'John Doe'.");
        assertEquals(30, person.getAge(), "Age should be 30.");
        assertEquals(1, person.getId(), "ID should be 1.");
    }

    @Test
    void testGetName() {
        // Test the getter for the name
        assertEquals("John Doe", person.getName(), "Name should be 'John Doe'.");
    }

    @Test
    void testSetName() {
        // Test the setter for the name
        person.setName("Jane Doe");
        assertEquals("Jane Doe", person.getName(), "Name should be updated to 'Jane Doe'.");
    }

    @Test
    void testGetAge() {
        // Test the getter for the age
        assertEquals(30, person.getAge(), "Age should be 30.");
    }

    @Test
    void testSetAge() {
        // Test the setter for the age
        person.setAge(35);
        assertEquals(35, person.getAge(), "Age should be updated to 35.");
    }

    @Test
    void testGetId() {
        // Test the getter for the ID
        assertEquals(1, person.getId(), "ID should be 1.");
    }

    @Test
    void testSetId() {
        // Test the setter for the ID
        person.setId(2);
        assertEquals(2, person.getId(), "ID should be updated to 2.");
    }

    @Test
    void testDisplayInfo() {
        // Test the displayInfo() method
        // Since displayInfo prints directly to the console, we can check if it runs without exceptions
        assertDoesNotThrow(() -> person.displayInfo(), "displayInfo should not throw any exception.");
    }
}

