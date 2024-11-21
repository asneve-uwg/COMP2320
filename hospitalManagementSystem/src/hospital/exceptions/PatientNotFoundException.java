package hospital.exceptions;

public class PatientNotFoundException extends Exception {

    // Default constructor with a generic message
    public PatientNotFoundException() {
        super("Patient not found!");
    }

    // Constructor that accepts a custom message
    public PatientNotFoundException(String message) {
        super(message);
    }
}
