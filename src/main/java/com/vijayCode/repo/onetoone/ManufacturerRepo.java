package com.vijayCode.repo.onetoone;

import com.vijayCode.entity.onetoone.primaryKey.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepo extends JpaRepository<Manufacturer,Integer> {
}
