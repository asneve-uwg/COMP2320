package main.fileHandlers.patients;

import java.io.*;

import hospital.entities.Patient;

public class PatientFileHandler implements PatientOperations {

    
    public void writeFile(String filename, String content) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            byte[] strToBytes = content.getBytes();
            outputStream.write(strToBytes);
            System.out.println("Patient data written to file.");
        }
    }

    
    public void appendToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            System.out.println("Patient data appended to file.");
        }
    }

    
    public void readFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading patient data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    
    public void addPatient(String patientName, int patientId, int age) throws IOException {
    	
        String patientData = patientName + ", " + patientId + "\n";
        appendToFile("patients.txt", patientData);
}


	@Override
	public void writeToFile(String filename, String content) throws IOException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
