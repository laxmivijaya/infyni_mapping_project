package com.vijayCode.repo.onetomany;

import com.vijayCode.entity.onetomany.jointable.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Integer> {
}
