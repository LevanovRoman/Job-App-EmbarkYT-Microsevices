package com.myapp.companyms.company;

import com.myapp.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);


    void updateCompanyRating(ReviewMessage reviewMessage);
}
