package main.fileHandlers.room;
import java.io.IOException;

import main.fileHandlers.FileAction;


public interface RoomOperations extends FileAction {
    void addRoom(int roomNumber, int capacity) throws IOException;

}
