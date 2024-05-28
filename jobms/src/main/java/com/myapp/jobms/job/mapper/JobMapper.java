package com.myapp.jobms.job.mapper;

import com.myapp.jobms.job.Job;
import com.myapp.jobms.job.dto.JobDTO;
import com.myapp.jobms.job.external.Company;
import com.myapp.jobms.job.external.Review;

import java.util.List;

public class JobMapper {

    public static JobDTO mapToJobDTO(Job job, Company company, List<Review> reviews){

        JobDTO jobDTO = new JobDTO();

        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setCompany(company);
        jobDTO.setReviews(reviews);

        return jobDTO;

    }
}
