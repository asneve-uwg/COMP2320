package main;

import hospital.entities.*;
import main.fileHandlers.patients.PatientFileHandler;
import main.fileHandlers.room.RoomFileHandler;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String userCommand;
        RoomFileHandler roomFileHandler = new RoomFileHandler();
        PatientFileHandler patientFileHandler = new PatientFileHandler();

        do {
            // Prompt user for input
            System.out.println("Enter command ('r' to add room, 'p' to add patient, 's' to show all 'q' to quit): ");
            userCommand = scnr.next();

            // Add new room
            if (userCommand.equals("r")) {
                System.out.println("Enter room details: ");
                System.out.print("Room Number: ");
                int roomNumber = scnr.nextInt();
                System.out.print("Capacity: ");
                int capacity = scnr.nextInt();

                try {
                    roomFileHandler.addRoom(roomNumber, capacity);
                    System.out.println("Room added successfully!");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error adding room: " + e.getMessage());
                }
                
            }

            // Add new patient
            else if (userCommand.equals("p")) {
            	System.out.println("Enter patient details: ");
                System.out.print("First Name: ");
                String firstName = scnr.next();   // Get first name
                System.out.print("Last Name: ");
                String lastName = scnr.next();    // Get last name
                String patientName = firstName + " " + lastName;  // Concatenate first and last name
                System.out.print("Age: ");
                int age = scnr.nextInt();
                System.out.println("ID : ");
                int patientID =scnr.nextInt();
                
   
                
                try {
                    patientFileHandler.addPatient(patientName, age, patientID);
                    System.out.println("Patient added successfully!");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error adding patient: " + e.getMessage());
                }
            }

            // Show all rooms
            else if (userCommand.equals("s")) {
                System.out.println("Show All Rooms:");
                roomFileHandler.readFile("rooms.txt");  // Display all rooms
                System.out.println("\nShow All Patients:");
                patientFileHandler.readFile("patients.txt");  // Display all patients
            }
            
        } while (!userCommand.equals("q"));
    }
}
