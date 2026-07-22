package com.app.jobtracker.controller;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    public String saveJob(@Valid @ModelAttribute JobApplication jobApplication, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add-job";
        }
        jobApplicationService.addJobApplication(jobApplication);
        return "redirect:/";
    }

    @GetMapping("/delete-job/{id}")
    public String deleteJob(@PathVariable Long id){
        jobApplicationService.deleteJobApplication(id);
        return "redirect:/";
    }

    @GetMapping("/edit-job/{id}")
    public String editJob(@PathVariable Long id, Model model){
        JobApplication jobApplication = jobApplicationService.getJobApplicationById(id);
        if(jobApplication==null){
            return "redirect:/";
        }

        model.addAttribute("jobApplication", jobApplication);
        return "add-job";
    }
}
