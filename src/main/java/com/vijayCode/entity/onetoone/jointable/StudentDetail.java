package com.vijayCode.entity.onetoone.jointable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name="StudentDetail")
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentDetailsId;
    private String department;
    private String mark;
    private String section;

}
