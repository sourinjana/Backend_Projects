package com.example.UniversityEventManagementWithH2.controller;

import com.example.UniversityEventManagementWithH2.model.Event;
import com.example.UniversityEventManagementWithH2.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping("events")
    public String addEvents(@RequestBody List<Event> events){
        return eventService.addEvents(events);
    }

    @GetMapping("events")
    public Iterable<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("date/{date}")
    public List<Event> getEventsByDate(@PathVariable LocalDate date){
        return eventService.getEventsByDate(date);

    }

    @DeleteMapping("event/id/{id}")
    public String deleteEventById(@PathVariable Integer id){
        return eventService.deleteEventById(id);
    }

    @PutMapping("event/id/{id}/loc/{loc}")
    public String updateLocation(@PathVariable Integer id,@PathVariable String loc){
        return eventService.updateLocation(id,loc);
    }


}
