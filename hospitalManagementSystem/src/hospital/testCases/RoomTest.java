package hospital.testCases;

import hospital.entities.*;
import hospital.exceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class RoomTest {

    private Room room;
    private Patient patient1;
    private Patient patient2;
    
    @BeforeEach
    void setUp() {
    	// Initialize room and patients before each test
        room = new Room(101, 2);  // Room number 101 with a capacity of 2
        patient1 = new Patient("John Doe", 30, 1); // Create patient with ID 1
        patient2 = new Patient("Jane Smith", 28, 2); // Create patient with ID 2
   }

    @Test
    void testAddPatient_Success() throws RoomFullException {
    	

        // Add a patient and verify they are in the room
        room.addPatient(patient1);
        room.addPatient(patient2);

        // We cannot add more patients beyond the capacity
        assertEquals(2, room.getCurrentPatients().size(), "Room should have 2 patients."); // changed from assertEquals(2, room.getCapacity()), "Room should have 2 patients.");
    }
}

//    @Test
//    void testAddPatient_RoomFull() {
//        // Add patients to the room
//        try {
//            room.addPatient(patient1);
//            room.addPatient(patient2);
//
//            // Try adding a third patient when room is full
//            Patient patient3 = new Patient(3);
//            room.addPatient(patient3);
//            fail("RoomFullException expected");
//        } catch (RoomFullException e) {
//            // This is expected, so we check that the exception was thrown
//            assertTrue(e.getMessage().contains("Room is full!"));
//        }
//    }
//
//    @Test
//    void testRemovePatient_Success() throws PatientNotFoundException {
//        // Add patients to the room
//        room.addPatient(patient1);
//        room.addPatient(patient2);
//
//        // Remove a patient and verify they are removed
//        room.removePatient(1); // Remove patient with ID 1
//        assertEquals(1, room.getCapacity(), "Room should have 1 patient after removal.");
//
//        // Verify the correct patient remains
//        assertFalse(room.getCapacity().contains(patient1), "Patient 1 should be removed.");
//        assertTrue(room.getCapacity().contains(patient2), "Patient 2 should remain.");
//    }
//
//    @Test
//    void testRemovePatient_PatientNotFound() {
//        // Add only one patient to the room
//        room.addPatient(patient1);
//
//        // Try to remove a non-existing patient (patient with ID 2)
//        assertThrows(PatientNotFoundException.class, () -> {
//            room.removePatient(2); // Patient with ID 2 doesn't exist in the room
//        }, "PatientNotFoundException expected.");
//    }
//
//    @Test
//    void testGetRoomNumber() {
//        // Test the getter for room number
//        assertEquals(101, room.getRoomNumber(), "Room number should be 101.");
//    }
//
//    @Test
//    void testSetRoomNumber() {
//        // Set a new room number and test it
//        room.setRoomNumber(102);
//        assertEquals(102, room.getRoomNumber(), "Room number should be updated to 102.");
//    }
//
//    @Test
//    void testGetCapacity() {
//        // Test the getter for capacity
//        assertEquals(2, room.getCapacity(), "Room capacity should be 2.");
//    }
//
//    @Test
//    void testSetCapacity() {
//        // Set a new room capacity and test it
//        room.setCapacity(3);
//        assertEquals(3, room.getCapacity(), "Room capacity should be updated to 3.");
//    }
//
//    @Test
//    void testDisplayInfo() {
//        // Capture the output of displayInfo() method
//        // (Assuming displayInfo just prints to the console; we would use a custom output capturing method if necessary)
//        // This test is somewhat trivial because displayInfo prints directly, but we want to ensure that it doesn't throw any exceptions.
//
//        assertDoesNotThrow(() -> room.displayInfo(), "displayInfo should not throw an exception.");
//    }
