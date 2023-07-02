package com.sourin.JobSearchPortal.repository;

import com.sourin.JobSearchPortal.model.Job;
import com.sourin.JobSearchPortal.model.Type;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {
  List<Job> findJobByLocation(String location);

  List<Job> findJobBySalaryGreaterThanEqualAndTitle(Double salary,String title);

  List<Job> findJobByJobType(Type type);

  List<Job> findJobByCompanyName(String companyName);


  //Use Custom Query
  @Modifying
  @Transactional
  @Query(value = "update job set SALARY = :salary where id= :id",nativeQuery = true)
  void updateSalary(Double salary,Long id);


  @Modifying
  @Transactional
  @Query(value = "delete from job where id= :id",nativeQuery = true)
  void deleteJob(Long id);
}
