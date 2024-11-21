package hospital.entities;
import hospital.exceptions.*;
public class Patient extends Person{
	private char gender;
//	private String bloodType;
//	private String allergies;
//	private String medicalHistory;
//	private String currentMedication;
//	private String emergencyContact;
	private int roomNumber;

	/**
	 * Constructor for the Patient class
	 * 
	 * @param name the name of the patient
	 * @param age the age of the patient
	 * @param roomNumber the room number of the patient
	 */
	
	public Patient(String name, int age, int id) {
		super(name, age ,id);
		// TODO Auto-generated constructor stub
	}


	 /**
	  * Override the displayInfo() method from the Person class 
		to disp;ay specifice information to th patient
		including Patient room number,
		*/

	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Room Number: " + this.roomNumber);
			        

			       
			    }

			public char getGender() {
				return gender;
			}

			public void setGender(char gender) throws InvalidGenderException {
				if (gender != 'M' && gender != 'F' && gender != 'O') {
				        throw new InvalidGenderException("Invalid gender: " + gender + ". Allowed values are 'M', 'F', or 'O'.");
				    }
				
				this.gender = gender;
				
			}

			public int getRoomNumber() {
				return roomNumber;
			}

			public void setRoomNumber(int roomNumber) throws InvalidRoomNumberException {
				 if (roomNumber <= 0) {
				        throw new InvalidRoomNumberException("Invalid room number: " + roomNumber + ". Room number must be greater than 0.");
				    }
				this.roomNumber = roomNumber;
			}
			
	}
