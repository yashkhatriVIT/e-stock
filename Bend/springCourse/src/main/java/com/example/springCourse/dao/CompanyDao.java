package com.example.springCourse.dao;

import com.example.springCourse.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, Long> {

}
