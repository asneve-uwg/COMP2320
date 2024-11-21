package hospital.testCases;

	import hospital.entities.Patient;
	import hospital.entities.Person;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

	/**
	 * JUnit test cases for the Patient class.
	 */
	class PatientTest {

	    private Patient patient;

	    @BeforeEach
	    void setUp() {
	        // Initialize the Patient object before each test
	        patient = new Patient("John Doe", 30, 1);  
	    }

	    @Test
	    void testConstructor() {
	        // Test if the constructor properly initializes the Patient object
	        assertNotNull(patient, "Patient object should be created.");
	        assertEquals("John Doe", patient.getName(), "Name should be 'John Doe'.");
	        assertEquals(30, patient.getAge(), "Age should be 30.");
	        assertEquals(1, patient.getId(), "ID should be 1.");
	    }

	    @Test
	    void testGetGender() {
	        // Test the getter for gender
	        patient.setGender('M');
	        assertEquals('M', patient.getGender(), "Gender should be 'M'.");
	    }

	    @Test
	    void testSetGender() {
	        // Test the setter for gender
	        patient.setGender('F');
	        assertEquals('F', patient.getGender(), "Gender should be updated to 'F'.");
	    }

	    @Test
	    void testGetRoomNumber() {
	        // Test the getter for room number
	        patient.setRoomNumber(101);
	        assertEquals(101, patient.getRoomNumber(), "Room number should be 101.");
	    }

	    @Test
	    void testSetRoomNumber() {
	        // Test the setter for room number
	        patient.setRoomNumber(102);
	        assertEquals(102, patient.getRoomNumber(), "Room number should be updated to 102.");
	    }

	    @Test
	    void testDisplayInfo() {
	        // Test the displayInfo() method
	        // Here, we can't directly assert output to the console easily, but we can check that it runs without exception.
	        assertDoesNotThrow(() -> patient.displayInfo(), "displayInfo should not throw any exception.");
	    }

	    @Test
	    void testDisplayInfo_PatientDetails() {
	        // Set some details and capture the output (just a basic validation here)
	        patient.setRoomNumber(202);
	        patient.setGender('F');
	        // Assuming the displayInfo method prints information, we could use a custom method to capture stdout if necessary
	        // For now, just verify no exception occurs during display
	        assertDoesNotThrow(() -> patient.displayInfo(), "displayInfo should not throw any exception.");
	    }

	    @Test
	    void testPatientInheritance() {
	        // Ensure that the Patient class inherits from Person
	        assertTrue(patient instanceof Person, "Patient should be an instance of Person.");
	    }

	    // Optionally, if you want to validate room number constraints, you can add a validation test.
	    @Test
	    void testSetInvalidRoomNumber() {
	        // Test invalid room number input (e.g., negative or zero)
	        assertThrows(IllegalArgumentException.class, () -> {
	            patient.setRoomNumber(-1);
	        }, "Room number cannot be negative.");
	    }
	}

