package com.app.jobtracker.controller;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.service.JobApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService){
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping("/")
    public String home(Model model){
        List<JobApplication> jobs = jobApplicationService.findAllApplications();
        model.addAttribute("jobs", jobs);
        return "home";
    }

    @GetMapping("/add-job")
    public String addJobPage(Model model){
        JobApplication jobApplication = new JobApplication();
        model.addAttribute("jobApplication", jobApplication);
        return "add-job";
    }

    @PostMapping("/save-job")
    public String saveJob(@ModelAttribute JobApplication jobApplication){
        jobApplicationService.addJobApplication(jobApplication);
        return "redirect:/";
    }
}
