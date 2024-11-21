package main;

import hospital.entities.*;

import java.io.*;
import java.util.*;

	public class Main {
	    public static void main(String[] args) throws IOException {
	        // Call the method with the filename as a parameter
	    	ReadFile.readRoomsFromFile("rooms.txt");
	    	FileWrite.writeAndAppendToFile("rooms.txt");
	    }
	}
	