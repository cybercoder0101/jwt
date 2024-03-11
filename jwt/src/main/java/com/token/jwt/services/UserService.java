package com.token.jwt.services;

import com.token.jwt.entities.Role;
import com.token.jwt.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername(String username);
     Role addRole(Role role);
     User addRoleToUser(String username, String rolename);
     List<User> findAllUsers();
}
