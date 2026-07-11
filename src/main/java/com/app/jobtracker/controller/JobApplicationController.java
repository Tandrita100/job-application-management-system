package com.app.jobtracker.controller;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
