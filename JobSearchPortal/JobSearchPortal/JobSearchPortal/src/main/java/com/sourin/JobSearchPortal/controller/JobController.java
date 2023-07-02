package com.sourin.JobSearchPortal.controller;

import com.sourin.JobSearchPortal.model.Job;
import com.sourin.JobSearchPortal.model.Type;
import com.sourin.JobSearchPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;


    //Use Crud Repository
     @GetMapping("jobs")
    public Iterable<Job> getAll(){
        return jobService.getAll();
    }

    @PostMapping("jobs")
    public String addAllJob(@RequestBody List<Job> jobs){
        return jobService.addAllJob(jobs);
    }


    @GetMapping("id/{id}")
    public boolean getExistById(@PathVariable Long id){
         return jobService.getExistById(id);
    }
    @GetMapping("count")
    public long getCount(){
         return jobService.getCount();
    }


    // Use Custom Finder
    @GetMapping("location/{loc}")
    public List<Job> getJobsByLoc(@PathVariable String loc){
         return jobService.getJobsByLoc(loc);
    }
    @GetMapping("salary/{salary}/title/{title}")
    public List<Job> getSalaryTitle(@PathVariable Double salary,@PathVariable String title){
         return jobService.getSalaryTitle(salary,title);
    }


    @GetMapping("type/{type}")
    public List<Job> getJobsByType(@PathVariable Type type){
        return jobService.getJobsByType(type);
    }

    @GetMapping("cname/{canme}")
    public List<Job> getJobsByCompanyName(@PathVariable String cname){
        return jobService.getJobsByCompanyName(cname);
    }


    //Use Custom Query

    @PutMapping("up/salary/{salary}/id/{id}")
    public String updateSalary(@PathVariable Double salary , @PathVariable Long id){
         return jobService.updateSalary(salary,id);

    }


    @DeleteMapping("de/id/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);

    }




}
