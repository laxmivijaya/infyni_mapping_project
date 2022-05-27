package com.vijayCode.repo.manytomany;

import com.vijayCode.entity.manytomany.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
