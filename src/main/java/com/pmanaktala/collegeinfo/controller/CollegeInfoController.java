package com.pmanaktala.collegeinfo.controller;

import com.pmanaktala.collegeinfo.entity.College;
import com.pmanaktala.collegeinfo.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CollegeInfoController {

    @Autowired
    private CollegeRepository repo;

    @PostMapping
    public College addCollege(@RequestBody College college){
        return repo.save(college);
    }
    @GetMapping(value = "/all")
    public List<College> getAllColleges(){
        return repo.findAll();
    }
}
