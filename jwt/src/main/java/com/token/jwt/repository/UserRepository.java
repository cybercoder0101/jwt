package com.token.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.token.jwt.entities.User;
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);

}
