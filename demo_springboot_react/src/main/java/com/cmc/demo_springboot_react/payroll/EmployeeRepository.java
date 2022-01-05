package com.cmc.demo_springboot_react.payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByDescription(String description);
}
