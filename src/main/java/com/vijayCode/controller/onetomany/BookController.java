package com.vijayCode.controller.onetomany;


import com.vijayCode.entity.onetomany.fk.Library;
import com.vijayCode.service.onetomany.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final LibraryService service;

    @PostMapping("/library")
    public ResponseEntity<Library> saveLibrary(@RequestBody Library request){
        return new ResponseEntity<>(service.saveLibrary(request), HttpStatus.CREATED);
    }

}
