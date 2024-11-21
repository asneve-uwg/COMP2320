package main.fileHandlers;

import java.io.IOException;


public interface FileAction {
    void writeToFile(String filename, String content) throws IOException;
    void appendToFile(String filename, String content) throws IOException;
    void readFromFile(String filename) throws IOException;
}
