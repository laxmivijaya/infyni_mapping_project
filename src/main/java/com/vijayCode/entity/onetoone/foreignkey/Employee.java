package com.vijayCode.entity.onetoone.foreignkey;


import com.vijayCode.entity.onetoone.foreignkey.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name="employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String name;
    private Double salary;


    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="addressId_fk")
    private Address address;

}