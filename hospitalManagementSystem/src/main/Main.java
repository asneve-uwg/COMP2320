package main;

import hospital.entities.*;
import main.fileHandlers.patients.PatientFileHandler;
import main.fileHandlers.room.RoomFileHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String userCommand;
        RoomFileHandler roomFileHandler = new RoomFileHandler();
        PatientFileHandler patientFileHandler = new PatientFileHandler();
        List<Patient> patientList = new ArrayList<>();

        do {
            // Prompt user for input
            System.out.println("Enter command ('r' to add room, 'p' to add patient, 's' to show all patients, 'q' to quit): ");
            userCommand = scnr.next();

            // Validate input: only accept 'r', 'p', 's', or 'q'
            while (!userCommand.matches("[rpsqRPSQ]")) {
                System.out.println("Invalid input! Please enter 'r', 'p', 's', or 'q': ");
                userCommand = scnr.next(); // Prompt the user to enter a valid input
            }

            // Add new room
            if (userCommand.equalsIgnoreCase("r")) {
                boolean validInput = false;

                // Loop until valid input is provided
                while (!validInput) {
                    try {
                        System.out.println("Enter room details: ");
                        System.out.print("Room Number: ");
                        int roomNumber = scnr.nextInt();
                        System.out.print("Capacity: ");
                        int capacity = scnr.nextInt();

                        // Try to add the room
                        roomFileHandler.addRoom(roomNumber, capacity);
                        System.out.println("Room added successfully!");
                        validInput = true; // Exit loop if input is valid
                    } catch (InputMismatchException e) {
                        // Handle invalid data type input
                        System.out.println("Invalid input! Please enter numeric values for Room Number and Capacity.");
                        scnr.nextLine(); // Clear the invalid input from the scanner buffer
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Error adding room: " + e.getMessage());
                    }
                }
            }

            // Add new patient
            else if (userCommand.equalsIgnoreCase("p")) {
                boolean validPatientInput = false;

                // Loop until valid input is provided
                while (!validPatientInput) {
                    try {
                        System.out.println("Enter patient details: ");

                        // Get first and last name as strings
                        System.out.print("First Name: ");
                        String firstName = scnr.next(); // Get first name
                        if (!firstName.matches("[a-zA-Z]+")) {
                            throw new InputMismatchException("First name must only contain alphabetic characters.");
                        }

                        System.out.print("Last Name: ");
                        String lastName = scnr.next(); // Get last name
                        if (!lastName.matches("[a-zA-Z]+")) {
                            throw new InputMismatchException("Last name must only contain alphabetic characters.");
                        }

                        String patientName = firstName + " " + lastName; // Concatenate first and last name

                        // Get age as an integer
                        System.out.print("Age: ");
                        int age = scnr.nextInt();

                        // Get patient ID as an integer
                        System.out.print("ID: ");
                        int patientID = scnr.nextInt();

                        // Create a new Patient object and add it to the list
                        Patient newPatient = new Patient(patientName, patientID, age);
                        patientList.add(newPatient); // Add patient to the list

                        // Add patient to file
                        patientFileHandler.addPatient(patientName, age, patientID);
                        System.out.println("Patient added successfully!");
                        validPatientInput = true; // Exit loop if input is valid
                    } catch (InputMismatchException e) {
                        // Handle invalid data type input
                        System.out.println("Invalid input! Please make sure names are alphabetic and age/ID are numeric.");
                        scnr.nextLine(); // Clear the invalid input from the scanner buffer
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Error adding patient: " + e.getMessage());
                    }
                }
            }

            // Show all rooms and patients
            else if (userCommand.equalsIgnoreCase("s")) {
                System.out.println("Show All Rooms:");
                roomFileHandler.readFile("rooms.txt");  // Display all rooms
                System.out.println("\nShow All Patients:");
                patientFileHandler.readFile("patients.txt");  // Display all patients
            }

        } while (!userCommand.equalsIgnoreCase("q"));

        System.out.println("Exiting the program. Goodbye!");
    }
}
