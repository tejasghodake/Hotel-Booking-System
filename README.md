Hotel Room Booking System 🏨

A simple Spring Boot web application for hotel room booking with a modern frontend using Thymeleaf.

Features ✨

List all available hotel rooms

Book a room (mark it unavailable)

Modern UI with HTML + CSS

Integrated with MySQL using Spring Data JPA


Tech Stack 💻

Java 17

Spring Boot 3.x

Spring Data JPA

Thymeleaf

MySQL

HTML, CSS

Maven


Project Structure 📁

src
├── main
│   ├── java
│   │   └── com.example.hotel
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       ├── service
│   │       └── HotelBookingApplication.java
│   └── resources
│       ├── static
│       │   └── css
│       │       └── style.css
│       ├── templates
│       │   ├── index.html
│       │   └── rooms.html
│       └── application.properties

How to Run 🚀

1. Make sure you have Java 17 and MySQL installed.


2. Create a database named hotel_booking.


3. Update the DB credentials in application.properties.


4. Run the application:

mvn spring-boot:run


5. Open your browser and go to http://localhost:8080



Author

Developed by Tejas Ghodake 😊
