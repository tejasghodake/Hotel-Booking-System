package com.example.hotel.controller;

import com.example.hotel.model.Room;
import com.example.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookingController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Room> rooms = roomService.getAllRooms();
        model.addAttribute("rooms", rooms);
        return "index"; // returns index.html from templates
    }

    @GetMapping("/book/{id}")
    public String bookRoom(@PathVariable("id") Long id, Model model) {
        Room room = roomService.getRoomById(id);
        model.addAttribute("room", room);
        return "book"; // returns book.html from templates
    }

    @PostMapping("/bookRoom")
    public String confirmBooking(@ModelAttribute("room") Room room, Model model) {
        room.setAvailable(false); // Mark the room as booked
        roomService.updateRoom(room);
        model.addAttribute("message", "Room booked successfully!");
        return "redirect:/";
    }
}
