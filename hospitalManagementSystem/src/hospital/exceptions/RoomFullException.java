package hospital.exceptions;

public class RoomFullException extends Exception {


	private static final long serialVersionUID = 1L; //1L is version =number

	public RoomFullException() {
		super("Room is full!");
	}
	
	//
	public RoomFullException(String message) {
		super(message);
	}
}


/**
 *  If you don’t provide a serialVersionUID, Java generates one automatically 
 *  based on the classdetails. However, this default value can change if you 
 *  modify the class (e.g., add/remove fields), leading to potential
 *   compatibility issues.
*/