package com.vijayCode.controller.manytomany;


import com.vijayCode.entity.manytomany.User;
import com.vijayCode.service.manytomany.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/user")
    public ResponseEntity<List<User>> saveUser(@RequestBody List<User> users) {
        return new ResponseEntity<>(service.saveUsers(users), HttpStatus.CREATED);
    }

}
