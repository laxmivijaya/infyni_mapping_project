package com.vijayCode.service.onetomany;

import com.vijayCode.entity.onetomany.fk.Library;
import com.vijayCode.repo.onetomany.LibraryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LibraryService {

    private final LibraryRepo libraryRepo;

    public Library saveLibrary(Library Library) {
        return libraryRepo.save(Library);
    }

}
