package com.vijayCode.controller.onetomany;

import com.vijayCode.entity.onetomany.jointable.Country;
import com.vijayCode.service.onetomany.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService service;

    @PostMapping("/country")
    public ResponseEntity<Country> saveCountry(@RequestBody Country request){
        return new ResponseEntity<>(service.saveCountry(request), HttpStatus.CREATED);
    }
}
