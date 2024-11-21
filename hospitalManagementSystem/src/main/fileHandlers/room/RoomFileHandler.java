package main.fileHandlers.room;

import java.io.*;

import main.fileHandlers.FileHandler;

public class RoomFileHandler extends FileHandler implements RoomOperations {

    @Override
    public void writeFile(String filename, String content) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filename)) {
            byte[] strToBytes = content.getBytes();
            outputStream.write(strToBytes);
            System.out.println("Room data written to file.");
        }
    }

    @Override
    public void appendToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
            System.out.println("Room data appended to file.");
        }
    }

    @Override
    public void readFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading room data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    
        @Override
        public void addRoom(int roomNumber, int capacity) throws IOException {
            String roomData = "Room Number: " + roomNumber + "\nCapacity: " + capacity + "\n";
            appendToFile("rooms.txt", roomData);
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
