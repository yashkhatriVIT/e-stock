package com.example.springCourse.controller;

import com.example.springCourse.entities.Company;
import com.example.springCourse.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController

public class CompanyController {
    @Autowired
    private CompanyService courseService;
    public CompanyController() {
    }
    @GetMapping("/home")
    public String home(){
        return "this is home";
    }

    @GetMapping("/api/v1.0/market/company/getall")
    public List<Company> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/api/v1.0/market/company/info/{id}")
    public Optional<Company> getCourse(@PathVariable String id){
        return this.courseService.getCourse(Long.parseLong(id));
    }

    @PostMapping("/api/v1.0/market/company/register")
    public Company addCourse(@RequestBody Company course){
        return this.courseService.addCourse(course);
    }



    @DeleteMapping("/api/v1.0/market/company/delete/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id){
        try{
            this.courseService.deleteCourse(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}



/*
http://localhost:8080/api/v1.0/market/company/register
{
    "compId" : 202,
    "website": "aaa",
    "stkEx" : 23,
    "name": "Yash",
    "ceo": "Khatri"
}
http://localhost:8080/api/v1.0/market/company/info/202

http://localhost:8080/api/v1.0/market/stock/add/202
{
    12
}

http://localhost:8080/api/v/1.0/market/stock/get/202/14-06-2022/16-06-2022

* */