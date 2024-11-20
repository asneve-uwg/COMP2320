package hospital.manager;

import hospital.entities.Patient;
import hospital.exceptions.PatientNotFoundException;
import hospital.exceptions.RoomFullException;

abstract class RoomManager {
    public abstract void assignRoom(Patient patient, int roomNumber) throws RoomFullException;
    public abstract void removeRoom(int patientId) throws PatientNotFoundException;
}