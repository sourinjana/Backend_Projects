package com.example.UniversityEventManagementWithH2.repository;

import com.example.UniversityEventManagementWithH2.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {
      List<Event> findByEventDate(LocalDate data);
}
