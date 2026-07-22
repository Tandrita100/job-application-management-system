package com.app.jobtracker.service;

import com.app.jobtracker.entity.JobApplication;
import com.app.jobtracker.repository.JobApplicationRepository;
import org.springframework.data.domain.Sort;
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
        return jobApplicationRepository.findAll(
                Sort.by(Sort.Direction.DESC,"appliedDate")
        );
    }

    public JobApplication getJobApplicationById(Long id){
        return jobApplicationRepository.findById(id).orElse(null);
    }

    public JobApplication updateJobApplication(Long id, JobApplication updatedJobApplication){
        JobApplication existingJobApplication = jobApplicationRepository.findById(id).orElse(null);

        if(existingJobApplication == null){
            return null;
        }

        existingJobApplication.setCompany(updatedJobApplication.getCompany());
        existingJobApplication.setPosition(updatedJobApplication.getPosition());
        existingJobApplication.setPlatform(updatedJobApplication.getPlatform());
        existingJobApplication.setJobType(updatedJobApplication.getJobType());
        existingJobApplication.setLocation(updatedJobApplication.getLocation());
        existingJobApplication.setAppliedDate(updatedJobApplication.getAppliedDate());
        existingJobApplication.setJobStatus(updatedJobApplication.getJobStatus());
        existingJobApplication.setNotes(updatedJobApplication.getNotes());

        return jobApplicationRepository.save(existingJobApplication);
    }

    public void deleteJobApplication(Long id){
        if(!jobApplicationRepository.existsById(id)){
            return;
        }
        jobApplicationRepository.deleteById(id);
    }
}
