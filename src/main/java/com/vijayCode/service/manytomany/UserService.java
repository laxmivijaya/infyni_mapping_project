package com.vijayCode.service.manytomany;


import com.vijayCode.entity.manytomany.User;
import com.vijayCode.repo.manytomany.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo repo;

    public List<User> saveUsers(List<User> request){
        request.forEach(obj->obj.setUserid(UUID.randomUUID()));
        return repo.saveAll(request);
    }
}
