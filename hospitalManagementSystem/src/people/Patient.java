package people;

public class Patient extends Person{
	
	
	public Patient(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

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
	public Patient(String name, int age, int roomNumber){
		 super(name, age);
		 this.roomNumber = roomNumber;
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

			public void setGender(char gender) {
				this.gender = gender;
			}

			public int getRoomNumber() {
				return roomNumber;
			}

			public void setRoomNumber(int roomNumber) {
				this.roomNumber = roomNumber;
			}
			
	}
