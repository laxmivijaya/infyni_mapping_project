package com.vijayCode.entity.onetomany.jointable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@Entity
@Table(name="Country")
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer countryId;
    private String name;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "country_state", joinColumns = @JoinColumn(name = "countryId")
            , inverseJoinColumns = @JoinColumn(name = "stateId"))
    private Set<State> states;

}
