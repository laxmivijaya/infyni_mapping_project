package com.vijayCode.controller.onetoonemapping;

import com.vijayCode.entity.onetoone.jointable.Student;
import com.vijayCode.service.onetoone.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student request){
        return new ResponseEntity<>(service.saveStudent(request), HttpStatus.CREATED);
    }
}
