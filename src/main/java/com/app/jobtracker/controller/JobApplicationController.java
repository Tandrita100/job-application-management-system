package com.app.jobtracker.controller;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController (JobApplicationService jobApplicationService){
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping
    public JobApplication addJobApplication(@RequestBody JobApplication jobApplication){
        return jobApplicationService.addJobApplication(jobApplication);
    }

    @GetMapping
    public List<JobApplication> findAllApplication(){
        return jobApplicationService.findAllApplications();
    }

    @GetMapping("/{id}")
    public JobApplication findById( Long id){
        return jobApplicationService.getJobApplicationById(id);
    }
}
