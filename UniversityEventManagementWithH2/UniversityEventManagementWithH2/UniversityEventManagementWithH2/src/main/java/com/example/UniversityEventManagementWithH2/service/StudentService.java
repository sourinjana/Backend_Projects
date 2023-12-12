package com.example.UniversityEventManagementWithH2.service;

import com.example.UniversityEventManagementWithH2.model.Student;
import com.example.UniversityEventManagementWithH2.model.Type;
import com.example.UniversityEventManagementWithH2.repository.IStudentRepo;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudents(List<Student> students) {
        studentRepo.saveAll(students);
        
        return "add Student done";
    }

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }


    public String updateDepartment(Integer id, Type type) {
        Optional<Student> myDept=studentRepo.findById(id);
        Student myStu=null;

        if(myDept.isPresent()){
            myStu=myDept.get();
            myStu.setDepartment(type);
            studentRepo.save(myStu);
            return "Update Done ";
        }


        return "update Not done id not found "+id;
    }

    public String deleteStudent(Integer id) {


        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return "delete done ";
        }

        return "delete not done "+id;

    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }
}
