package com.myapp.jobms.job;

import com.myapp.jobms.job.dto.JobWithCompanyDTO;

import java.util.List;

public interface JobService {

    List<JobWithCompanyDTO> findAll();

    void createJod(Job job);

    Job getJobById(Long id);

    boolean deleteJob(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
