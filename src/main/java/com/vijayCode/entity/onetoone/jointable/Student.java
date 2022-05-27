package com.vijayCode.entity.onetoone.jointable;

import com.vijayCode.entity.onetoone.primaryKey.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String name;
    private String age;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "student_studentDetail", joinColumns = @JoinColumn(name = "studentId")
            , inverseJoinColumns = @JoinColumn(name = "studentDetailsId"))
    private StudentDetail detail;

}
