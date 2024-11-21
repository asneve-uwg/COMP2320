package main.fileHandlers;

import java.io.*;

public abstract class FileHandler implements FileAction {
    // Method to write content to the file
    public void writeFile(String filename, String content) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            byte[] strToBytes = content.getBytes();
            outputStream.write(strToBytes);
            System.out.println("File is created successfully with the content.");
        }
    }

    // Method to append content to the file
    public void appendToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            System.out.println("Data appended successfully.");
        }
    }

    // Abstract method for reading file content
    public abstract void readFile(String filename) throws IOException;
}
