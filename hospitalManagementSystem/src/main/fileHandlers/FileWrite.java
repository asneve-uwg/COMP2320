package main.fileHandlers;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void writeAndAppendToFile(String filename) {
        // Initial content to write to the file
        String fileContent = "101, 2\n102, 3\n103, 2"; // Example room data

        // Write to the file
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(filename);

            // Convert string to bytes and write to the file
            byte[] strToBytes = fileContent.getBytes();
            outputStream.write(strToBytes);

            System.out.println("File is created successfully with the content.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            // Close the file output stream
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }

        // Append additional content to the file
        String textToAppend = "\n104, 4"; // New room data to append
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(textToAppend);
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to the file: " + e.getMessage());
        }

        // Read and display the content of the file
        System.out.println("\nReading content from " + filename + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

