package com.example.repository;

import com.example.model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo,Integer>
{

}