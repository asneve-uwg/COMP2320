package main.fileHandlers.patients;

import java.io.IOException;

import main.fileHandlers.FileAction;

public interface PatientOperations extends FileAction {
    void addPatient(String patientName, int patientId, int roomNumber) throws IOException;

}
