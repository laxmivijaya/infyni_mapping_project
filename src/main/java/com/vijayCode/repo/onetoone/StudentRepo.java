package com.vijayCode.repo.onetoone;

import com.vijayCode.entity.onetoone.jointable.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}

