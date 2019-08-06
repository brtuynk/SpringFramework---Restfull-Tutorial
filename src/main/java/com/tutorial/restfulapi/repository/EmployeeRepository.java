package com.tutorial.restfulapi.repository;

import com.tutorial.restfulapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee , Long> {
}
