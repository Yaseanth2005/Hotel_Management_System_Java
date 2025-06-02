package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Room> rooms = new ArrayList<>();
    List<Reservation> reservations = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    public Hotel() {
    	rooms.add(new Room(101,"single"));
        rooms.add(new Room(102, "Double"));
        rooms.add(new Room(103, "Double"));
        rooms.add(new Room(104, "Double"));
        rooms.add(new Room(105, "Single"));
        rooms.add(new Room(106, "Single"));
        rooms.add(new Room(107, "Panel "));
        rooms.add(new Room(108, "Single"));
        rooms.add(new Room(109, "Single"));
        rooms.add(new Room(110, "Double"));
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        reservation.conformbooking();
    }

    public void cancelReservation(int customerId, int roomNumber) {
        for (Reservation r : reservations) {
            if (r.customer.cid == customerId && r.room.roomNumber == roomNumber) {
                r.cancelReservation();
                reservations.remove(r);
                return;
            }
        }
        System.out.println(" Reservation not found!");
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(" Customer Registered Successfully! "
        		+"\nYour ID: " + customer.cid);
    }

    public Customer getCustomerById(int id) {
        for (Customer c : customers) {
            if (c.cid == id) return c;
        }
        return null;
    }
    

    public void searchAvailableRooms() {
        System.out.println("\n Available Rooms:");
        boolean anyAvailable = false;
        for (Room r : rooms) {
            if (r.isAvailable()) {
                r.displayRoom();
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No rooms currently available.");
        }
    }

    public Room getAvailableRoom(int roomNumber) {
        for (Room r : rooms) {
            if (r.roomNumber == roomNumber && r.isAvailable()) {
                return r;
            }
        }
        return null;
    }
}

