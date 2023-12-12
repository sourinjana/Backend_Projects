package com.sourin.EmployeeAddress.service.onetoone;

import com.sourin.EmployeeAddress.model.onetoone.Employee;
import com.sourin.EmployeeAddress.repository.onetoone.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public void addEmp(Employee employee) {
        employeeRepo.save(employee);
    }

    public Iterable<Employee> getAllEmployee() {

        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }


    public String deleteEmployeeById(Long id) {

        if(employeeRepo.existsById(id)){
            employeeRepo.deleteById(id);
            return "delete done";
        }

        return "delete not done id not found";
    }

    public String updateEmpForeignKeyById(Long fkId, Long id) {

        employeeRepo.updateEmpForeignKeyById(fkId,id);

        return "update done ";
    }
}
