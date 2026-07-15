package com.app.jobtracker.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "job_application")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String company;
    @NotBlank
    private String position;
    @NotBlank
    private String platform;
    @Enumerated(EnumType.STRING)
    @NotNull
    private JobType jobType;
    private String location;
    @NotNull
    private LocalDate appliedDate;
    @Enumerated(EnumType.STRING)
    @NotNull
    private JobStatus jobStatus;
    private String notes;

    public JobApplication() {

    }

    public JobApplication(String company, String position, String platform, JobType jobType, String location, LocalDate appliedDate, JobStatus jobStatus, String notes){
        this.company = company;
        this.position = position;
        this.platform = platform;
        this.jobType = jobType;
        this.location = location;
        this.appliedDate = appliedDate;
        this.jobStatus = jobStatus;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
