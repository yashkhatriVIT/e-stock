package com.example.springCourse.services;

import com.example.springCourse.dao.CompanyDao;
import com.example.springCourse.entities.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
//    List<Course> list;
    @Autowired
    private CompanyDao courseDao;
    public CompanyServiceImpl(){

    }
    @Override
    public List<Company> getCourses() {
        return this.courseDao.findAll();
    }

    @Override
    public Optional<Company> getCourse(long id) {
        return this.courseDao.findById(id);
    }

    @Override
    public Company addCourse(Company course) {
        System.out.println(course.toString());
        this.courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(String id) {
        long Id = Long.parseLong((id));
//        list = this.list.stream().filter(e->e.getId() != Id).collect(Collectors.toList());
        this.courseDao.deleteById(Id);

    }
}
