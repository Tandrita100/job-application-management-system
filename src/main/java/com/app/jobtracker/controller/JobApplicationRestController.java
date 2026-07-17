package com.app.jobtracker.controller;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobApplicationRestController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationRestController(JobApplicationService jobApplicationService){
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping
    public JobApplication addJobApplication(@Valid @RequestBody JobApplication jobApplication){
        return jobApplicationService.addJobApplication(jobApplication);
    }

    @GetMapping
    public List<JobApplication> findAllApplication(){
        return jobApplicationService.findAllApplications();
    }

    @GetMapping("/{id}")
    public JobApplication findJobApplicationById(@PathVariable Long id){
        return jobApplicationService.getJobApplicationById(id);
    }

    @PutMapping("/{id}")
    public JobApplication updateJobApplicationById(@PathVariable Long id, @RequestBody JobApplication updateJobApplication){
        return jobApplicationService.updateJobApplication(id,updateJobApplication);
    }

    @DeleteMapping("/{id}")
    public void deleteJobApplicationById(@PathVariable Long id){
        jobApplicationService.deleteJobApplication(id);
    }
}
