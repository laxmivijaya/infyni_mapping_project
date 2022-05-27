package com.vijayCode.controller.onetoonemapping;


import com.vijayCode.entity.onetoone.foreignkey.Employee;
import com.vijayCode.service.onetoone.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee request){
        return new ResponseEntity<>(service.saveEmployee(request), HttpStatus.CREATED);
    }
}
