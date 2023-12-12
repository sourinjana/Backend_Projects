package com.example.UniversityEventManagementWithH2.controller;

import com.example.UniversityEventManagementWithH2.model.Student;
import com.example.UniversityEventManagementWithH2.model.Type;
import com.example.UniversityEventManagementWithH2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("students")
    public String addStudents(@RequestBody List<Student> students){
        return studentService.addStudents(students);
    }

    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @GetMapping("id/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @PutMapping("id/{id}/type/{type}")
    public String updateDepartment(@PathVariable Integer id, @PathVariable Type type){
        return studentService.updateDepartment(id,type);
    }
    @DeleteMapping("id/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }


}
