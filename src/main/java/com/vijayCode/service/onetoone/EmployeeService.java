package com.vijayCode.service.onetoone;

import com.vijayCode.entity.onetoone.foreignkey.Employee;
import com.vijayCode.repo.onetoone.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo repo;


    public Employee saveEmployee(Employee employee){
        return repo.save(employee);
    }
}
