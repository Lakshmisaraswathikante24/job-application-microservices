package com.jobapp.companyms.company;

import java.util.List;

import com.jobapp.companyms.company.dto.ReviewMessage;

public interface CompanyService {
	List<Company> getAllCompanies();
	boolean updateCompany(Company company,Long id);
	void createCompany(Company company);
	boolean deleteByCompanyById(Long id);
	Company getCompanyById(Long id);
	void updateCompanyRating(ReviewMessage reviewMessage);

}
