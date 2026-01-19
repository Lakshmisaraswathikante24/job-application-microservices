package com.jobapp.job.mapper;

import java.util.List;

import com.jobapp.job.Job;
import com.jobapp.job.dto.JobDTO;
import com.jobapp.job.external.Company;
import com.jobapp.job.external.Review;

public class JobMapper {
	 public static JobDTO mapToJobWithCompanyDto(
	            Job job,
	            Company company, List<Review> reviews) {

	        JobDTO jobDTO = new JobDTO();
	        jobDTO.setId(job.getId());
	        jobDTO.setTitle(job.getTitle());
	        jobDTO.setDescription(job.getDescription());
	        jobDTO.setLocation(job.getLocation());
	        jobDTO.setMaxSalary(job.getMaxSalary());
	        jobDTO.setMinSalary(job.getMinSalary());
	        jobDTO.setCompany(company);
	        jobDTO.setReviews(reviews);

	        return jobDTO;
	    }

}
