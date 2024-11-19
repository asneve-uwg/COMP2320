package rooms;

public class Room {
    public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	protected int Floor;
    protected int RoomNumber;
    protected int Capacity;
    
    public Room(int floor, int roomNumber, int capacity) {
    	setFloor(5);
    	setRoomNumber(2);
    	setCapacity(3);
    	
    	
}
	 public void displayInfo(){
	        System.out.println("Room Number: " + this.RoomNumber);
	        System.out.println("Floor: " + this.Floor);
	        System.out.println("Capacity: " + this.Capacity);
	 }
}
