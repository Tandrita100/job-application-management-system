package com.app.jobtracker.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "job_application")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "company is required")
    @Pattern(regexp="^$|.*[A-Za-z].*", message="company must contain at least one letter")
    private String company;
    @NotBlank(message = "position is required")
    @Pattern(regexp="^$|.*[A-Za-z].*", message="position must contain at least one letter")
    private String position;
    @NotBlank(message = "platform is required")
    @Pattern(regexp="^$|.*[A-Za-z].*", message="platform must contain at least one letter")
    private String platform;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "jobType is required")
    private JobType jobType;
    @NotBlank(message = "location is required")
    @Pattern(regexp="^$|.*[A-Za-z].*", message="location must contain at least one letter")
    private String location;
    @NotNull(message = "appliedDate is required")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate appliedDate;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "company is required")
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
