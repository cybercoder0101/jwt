package com.token.jwt.repository;

import com.token.jwt.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
 Role findByRole(String role);

}
