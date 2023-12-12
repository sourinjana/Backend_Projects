package com.sourin.EmployeeAddress.controller.onetoone;

import com.sourin.EmployeeAddress.model.onetoone.Employee;
import com.sourin.EmployeeAddress.service.onetoone.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    //dependent
    @Autowired
    EmployeeService employeeService;
    @PostMapping("employee")
    public void addEmp(@RequestBody Employee employee){
        employeeService.addEmp(employee);
    }
    @GetMapping("employees")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("emp/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("add/{fk_id}/emp/{id}")
    public String updateEmpForeignKeyById(@PathVariable Long fk_id,@PathVariable Long id){
        return employeeService.updateEmpForeignKeyById(fk_id,id);
    }
    @DeleteMapping("emp/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }

}
