package hospital.entities;

import java.util.*;

import hospital.exceptions.PatientNotFoundException;
import hospital.exceptions.RoomFullException;


public class Room {
//	protected int floor;
    protected int roomNumber;
    protected int  capacity;
    private List<Patient> currentPatients;



    
    public Room( int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.currentPatients  = new ArrayList<>();
    	
    	
}
	 public void displayInfo(){
	        System.out.println("Room Number: " + this.roomNumber);
//	        System.out.println("Floor: " + this.Floor);
	        System.out.println("Capacity: " + this.capacity);
	 }
	 
	 public void addPatient(Patient patient) throws RoomFullException{
		 if(currentPatients.size() >= capacity) {
			 throw new RoomFullException("Room is full!");
		 }
		 currentPatients.add(patient);
	 }
	 
	 public void removePatient(int patientId) throws PatientNotFoundException {
		 for (Patient patient : currentPatients) {
			 if (patient.getId() ==patientId) {
				 currentPatients.remove(patient);
				 return;
			 }
		 }
		 
	 }
//	    public int getFloor() {
//			return floor;
//		}
//		public void setFloor(int floor) {
//			floor = floor;
//		}
		public int getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(int roomNumber) {
			this.roomNumber = roomNumber;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
}

