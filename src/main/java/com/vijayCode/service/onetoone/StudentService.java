package com.vijayCode.service.onetoone;

import com.vijayCode.entity.onetoone.jointable.Student;
import com.vijayCode.repo.onetoone.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo repo;


    public Student saveStudent(Student Student) {
        return repo.save(Student);
    }
}
