package com.app.jobtracker.service;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication addJobApplication(JobApplication jobApplication){
        return jobApplicationRepository.save(jobApplication);
    }

    public List<JobApplication> findAllApplications(){
        return jobApplicationRepository.findAll();
    }

    public JobApplication getJobApplicationById(Long id){
        return jobApplicationRepository.findById(id).orElse(null);
    }
}
