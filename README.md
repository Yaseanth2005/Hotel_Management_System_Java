# 🏨 Hotel Reservation System

This is a **Java-based Hotel Reservation System** that allows customers to book hotel rooms, view available rooms, and manage reservations. The system is designed to demonstrate object-oriented programming principles including encapsulation, inheritance, and modular design.

## 📁 Project Structure

HotelReservationSystem/

│

├── Customer.java # Represents customer details

├── Hotel.java # Core hotel logic including room and reservation handling

├── Main_Hotel.java # Main executable class with user interface

├── Reservation.java # Handles reservation details

├── Room.java # Describes room properties and availability

└── README.md # Project documentation



## 🔧 Features

- ✅ Add new customers and their details
- 🛏️ Add and list available rooms
- 📅 Make a reservation for a customer
- 🗓️ View all reservations
- ❌ Cancel existing reservations
- 📋 Console-based interaction with user-friendly prompts

## 📌 How to Run

1. **Compile the files**:
   ```bash
   javac *.java
Run the main program:


java Main_Hotel
🧱 Classes Overview
Customer.java
Encapsulates customer information such as name, contact details, and a unique ID.

Room.java
Manages room data like room number, room type (Single/Double/Deluxe), and availability status.

Reservation.java
Creates a reservation object linking customers with room and date details.

Hotel.java
Acts as the system’s core engine to:

Add rooms/customers

Make and cancel reservations

List available rooms and current reservations

Main_Hotel.java
Contains the main() method and provides a menu-driven console interface for users.

🎓 Concepts Demonstrated
Object-Oriented Programming (OOP): Classes, Objects, Inheritance, Encapsulation

Collections Framework: Usage of Lists to manage room and reservation data

Input Handling: Using Scanner for interactive user input

Modular Design: Clean separation of responsibilities across classes

🚀 Future Improvements
🔐 Add user authentication for admin and guests

💾 Connect to a database to persist data

🌐 Build a GUI interface or a web-based frontend

📊 Generate reservation reports

🤝 Contributing
Pull requests and improvements are welcome! Please fork the repository and submit a PR.
