package com.example.springCourse.services;

import com.example.springCourse.entities.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    //        GET /api/v1.0/market/company/getall ==> Fetches all the Company Details
    public List<Company> getCourses();

    //        GET /api/v1.0/market/company/info/companycode ==> Fetches the Company Details
    Optional<Company> getCourse(long id);

    //        POST /api/v1.0/market/company/register ==> Register a new company
    Company addCourse(Company course);

    //        DELETE /api/v1.0/market/company/delete/companycode ==> Deletes a company
    void deleteCourse(String id);
}






//        POST /api/v1.0/market/stock/add/companycode ==> Add new stock price
//        GET /api/v/1.0/market/stock/get/companycode/startdate/enddate
