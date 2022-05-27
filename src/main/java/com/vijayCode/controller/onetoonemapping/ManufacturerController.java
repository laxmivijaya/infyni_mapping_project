package com.vijayCode.controller.onetoonemapping;

import com.vijayCode.entity.onetoone.primaryKey.Manufacturer;
import com.vijayCode.service.onetoone.ManufacturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManufacturerController {

    private final ManufacturerService service;

    @PostMapping("/manufacturer")
    public ResponseEntity<Manufacturer> saveManufacturer(@RequestBody Manufacturer request){
        return new ResponseEntity<>(service.saveManufacturer(request), HttpStatus.CREATED);
    }
}
