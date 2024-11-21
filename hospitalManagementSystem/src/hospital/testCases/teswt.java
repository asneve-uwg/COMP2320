package hospital.testCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hospital.entities.Patient;
import hospital.entities.Room;
import hospital.exceptions.*;

class teswt {

    private Room room;
    private Patient patient1;
    private Patient patient2;

    @BeforeEach
    void setUp() {
        // Initialize a Room with a capacity of 1 for testing
        room = new Room(101, 1);
        
        // Initialize test patients
        patient1 = new Patient("John Doe", 30, 1);
        patient2 = new Patient("Jane Smith", 28, 2);
    }

    @Test
    void testAddPatient_Success() {
        // Test adding a patient successfully
        assertDoesNotThrow(() -> room.addPatient(patient1));
        assertEquals(1, room.getCurrentPatients().size());
        assertEquals("John Doe", room.getCurrentPatients().get(0).getName());
    }

    @Test
    void testAddPatient_RoomFullException() {
        // Add first patient - should succeed
        assertDoesNotThrow(() -> room.addPatient(patient1));
        
        // Attempt to add a second patient - should throw RoomFullException
        Exception exception = assertThrows(RoomFullException.class, () -> {
            room.addPatient(patient2);
        });

        // Verify that the correct exception is thrown
        assertEquals("Room is full!", exception.getMessage());
    }

    @Test
    void testRemovePatient_Success() {
        // Add a patient first to test removal
        assertDoesNotThrow(() -> room.addPatient(patient1));
        
        // Remove the patient - should succeed
        assertDoesNotThrow(() -> room.removePatient(1));
        assertEquals(0, room.getCurrentPatients().size());
    }

    @Test
    void testRemovePatient_PatientNotFoundException() {
        // Attempt to remove a patient that does not exist
        Exception exception = assertThrows(PatientNotFoundException.class, () -> {
            room.removePatient(999); // ID that doesn't exist
        });

        // Verify that the correct exception is thrown
        assertEquals("Patient with ID 999 not found!", exception.getMessage());
    }
    @Test
    void testGetRoomNumber() {
        // Test the getter for room number
        assertEquals(101, room.getRoomNumber(), "Room number should be 101.");
    }

  
}
