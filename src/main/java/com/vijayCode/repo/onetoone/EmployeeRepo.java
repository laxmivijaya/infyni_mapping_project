package com.vijayCode.repo.onetoone;

import com.vijayCode.entity.onetoone.foreignkey.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
