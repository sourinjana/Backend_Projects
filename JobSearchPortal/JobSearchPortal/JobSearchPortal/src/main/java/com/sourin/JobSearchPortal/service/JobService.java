package com.sourin.JobSearchPortal.service;

import com.sourin.JobSearchPortal.model.Job;
import com.sourin.JobSearchPortal.model.Type;
import com.sourin.JobSearchPortal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;

    public Iterable<Job> getAll() {
        return jobRepo.findAll();
    }

    public String addAllJob(List<Job> jobs) {

        jobRepo.saveAll(jobs);

        return "add done";
    }

    public boolean getExistById(Long id) {
        return jobRepo.existsById(id);
    }


    public long getCount() {

        return jobRepo.count();
    }


    public List<Job> getJobsByLoc(String loc) {
        return jobRepo.findJobByLocation(loc);
    }

    public List<Job> getSalaryTitle(Double salary, String title) {
        return jobRepo.findJobBySalaryGreaterThanEqualAndTitle(salary,title);
    }

    public List<Job> getJobsByType(Type type) {
        return jobRepo.findJobByJobType(type);
    }

    public List<Job> getJobsByCompanyName(String cname) {

        return jobRepo.findJobByCompanyName(cname);
    }

    public String updateSalary(Double salary, Long id) {

        if(jobRepo.existsById(id)){
            jobRepo.updateSalary(salary,id);
            return "salary update";
        }

        return "salary not update id not found";
    }

    public String deleteJob(Long id) {

        if(jobRepo.existsById(id)){
            jobRepo.deleteJob(id);
            return "delete done";
        }

        return "delete not done id not found";
    }
}
