package hotel;

import java.time.LocalDate;

import java.util.Scanner;

public class Main_Hotel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hotel hotel = new Hotel();
        
        System.out.print("Enter Your Name: ");
        String cname = s.nextLine();
        System.out.print("Enter Contact Number: ");
        int contact = s.nextInt();

        while (true) {
            System.out.println("\n---  Welcome To Our Hotel ---");
            System.out.println("1️.Register as Customer");
            System.out.println("2.Information");
            System.out.println("3.Check Room Availability");
            System.out.println("4️.Book a Room");
            System.out.println("5.Cancel Reservation");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine();
            

            switch (choice) {
                case 1:
                    Customer c = new Customer(cname, contact);
                    hotel.registerCustomer(c);
                    c.display_customer_info();
                    break;
                case 2:
                	Customer c_dis=new Customer(cname,contact);
                	c_dis.display_customer_info();

                case 3:
                    hotel.searchAvailableRooms();
                    break;

                case 4:
                    System.out.print("Enter Your Customer ID: ");
                    int cid = s.nextInt();
                    Customer existingCustomer = hotel.getCustomerById(cid);
                    if (existingCustomer != null) {
                        System.out.print("Enter Room Number to Book: ");
                        int rnum = s.nextInt();
                        System.out.println("Enter number of days to stay:");
                        int stay=s.nextInt();
                        Room room = hotel.getAvailableRoom(rnum);
                        if (room != null) {
                            LocalDate checkIn = LocalDate.now();
                            LocalDate checkOut = checkIn.plusDays(stay); 
                            Reservation res = new Reservation(existingCustomer, room, checkIn, checkOut);
                            hotel.addReservation(res);
                        } else {
                            System.out.println(" Room not available or invalid room number.");
                        }
                    } else {
                        System.out.println(" Invalid Customer ID.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Your Customer ID: ");
                    int cancelCid = s.nextInt();
                    System.out.print("Enter Room Number to Cancel: ");
                    int cancelRoom = s.nextInt();
                    hotel.cancelReservation(cancelCid, cancelRoom);
                    break;

                case 6:
                    System.out.println(" Thank you!");
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Invalid Choice. Please try again.");
            }
        }
    }
}
