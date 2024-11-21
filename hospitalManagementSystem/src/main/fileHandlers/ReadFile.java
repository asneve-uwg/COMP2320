package main.fileHandlers;

import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // Call the method with the filename as a parameter
        readRoomsFromFile("rooms.txt");
    }

    // Method to read room data from a file
    public static void readRoomsFromFile(String filename) throws IOException {
        FileInputStream fileByteStream = null;  // Input file stream
        Scanner inFS = null;
        int roomNumber;
        int capacity;

        System.out.println("Opening file " + filename + ".");
        fileByteStream = new FileInputStream(filename);
        inFS = new Scanner(fileByteStream);

        // Read and display the rooms
        System.out.println("\n" + "Rooms");
        System.out.println("--------------------");

        // Loop to read all room details from the file
        while (inFS.hasNextLine()) {
            // Read a full line from the file
            String line = inFS.nextLine().trim();

            // Skip empty lines
            if (line.isEmpty()) {
                continue;
            }

            // Split the line by comma
            String[] roomData = line.split(",");

            // Parse the room number and capacity
            try {
                roomNumber = Integer.parseInt(roomData[0].trim());
                capacity = Integer.parseInt(roomData[1].trim());

                // Display room information
                System.out.println("Room Number: " + roomNumber);
                System.out.println("Capacity: " + capacity);
                System.out.println();
            } catch (NumberFormatException e) {
                // Handle invalid data in the file
                System.out.println("Invalid data format in the file: " + line);
            }
        }

        // Close the file stream
        fileByteStream.close();
    }
}
