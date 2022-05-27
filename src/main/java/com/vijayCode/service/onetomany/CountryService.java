package com.vijayCode.service.onetomany;

import com.vijayCode.entity.onetomany.jointable.Country;
import com.vijayCode.repo.onetomany.CountryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepo countryRepo;

    public Country saveCountry(Country Country) {
        return countryRepo.save(Country);
    }

}
