package com.vijayCode.service.onetoone;


import com.vijayCode.entity.onetoone.primaryKey.Manufacturer;
import com.vijayCode.repo.onetoone.ManufacturerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManufacturerService {

    private final ManufacturerRepo repo;


    public Manufacturer saveManufacturer(Manufacturer Manufacturer) {
        return repo.save(Manufacturer);
    }
}
