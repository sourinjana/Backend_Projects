package com.example.UniversityEventManagementWithH2.repository;

import com.example.UniversityEventManagementWithH2.model.Student;
import com.example.UniversityEventManagementWithH2.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {

}
