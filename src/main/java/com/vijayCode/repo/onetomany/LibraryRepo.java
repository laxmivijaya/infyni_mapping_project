package com.vijayCode.repo.onetomany;

import com.vijayCode.entity.onetomany.fk.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library,Integer> {
}
