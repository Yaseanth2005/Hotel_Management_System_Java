package hotel;

public class Room {
    int roomNumber;
    String roomType;
    boolean isAvailable;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }
   
    public void setroomavailability(boolean status) {
    	isAvailable=status;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }

    public void displayRoom() {
        System.out.println("Room No:  " + roomNumber + " | Type:  " + roomType + " | Available:  " + isAvailable);
    }
    
}
