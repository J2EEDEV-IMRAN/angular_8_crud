package com.example.controller;

import com.example.model.EmployeeInfo;
import com.example.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
class EmployeeInfoController
{
    @Autowired
    public EmployeeInfoRepository employeeInfoRepository;

    @GetMapping("/EmployeeInfo")
    public List<EmployeeInfo> getEmployeeInfoes()
    {
        return  employeeInfoRepository.findAll();
    }

    @GetMapping("/EmployeeInfo/{id}")
    public EmployeeInfo getEmployeeInfoes(@PathVariable("id") Integer id)
    {
        return  employeeInfoRepository.findOne(id);
    }

    @GetMapping("/EmployeeInfo/{id}")
    public boolean deleteEmployeeInfo(@PathVariable("id") Integer id)
    {
        employeeInfoRepository.delete(id);
        return true;
    }

    @PostMapping("/EmployeeInfo")
    public EmployeeInfo createEmployeeInfo(EmployeeInfo employeeInfo)
    {
        return  employeeInfoRepository.save(employeeInfo);
    }
    @PutMapping("/EmployeeInfo")
    public EmployeeInfo updateEmployeeInfo(EmployeeInfo employeeInfo)
    {
        return  employeeInfoRepository.save(employeeInfo);
    }
}