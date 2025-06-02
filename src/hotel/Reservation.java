package hotel;

import java.time.LocalDate;

public class Reservation {
	
    Customer customer;
    Room room;
    LocalDate checkInDate;
    LocalDate checkOutDate;
    
    public Reservation(Customer customer, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
    public void conformbooking() {
    	room.setroomavailability(false);
    	System.out.println(" Booking Conforemed for Room " + room.roomNumber);
    }
    
    public void cancelReservation() {
        room.setroomavailability(true);
        System.out.println(" Reservation Cancelled for Room " + room.roomNumber);
    }

}
