package com.sourin.EmployeeAddress.repository.onetoone;

import com.sourin.EmployeeAddress.model.onetoone.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {

    @Modifying
    @Transactional
    @Query(value = "update employee set fk_address_id= :fk_id where emp_id= :id",nativeQuery = true)
    void updateEmpForeignKeyById(Long fk_id,Long id);
}
