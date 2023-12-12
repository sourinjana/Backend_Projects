package com.example.UniversityEventManagementWithH2.service;

import com.example.UniversityEventManagementWithH2.model.Event;
import com.example.UniversityEventManagementWithH2.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public String addEvents(List<Event> events) {
        eventRepo.saveAll(events);

        return "add event done";
    }

    public Iterable<Event> getAllEvents() {
        return eventRepo.findAll();
    }

    public String deleteEventById(Integer id) {

        if(eventRepo.existsById(id)){
            eventRepo.deleteById(id);
            return "delete done";
        }

        return "delete not done id not found : " +id;
    }

    public String updateLocation(Integer id, String loc) {

        Optional<Event> myEventOpt=eventRepo.findById(id);
        Event myEvent=null;
        if(myEventOpt.isPresent()){
            myEvent=myEventOpt.get();
            myEvent.setLocationOfEvent(loc);
            eventRepo.save(myEvent);
            return "update done";
        }
        return "update not done id not found"+id;
    }

    public List<Event> getEventsByDate(LocalDate date) {
        return eventRepo.findByEventDate(date);
    }
}
