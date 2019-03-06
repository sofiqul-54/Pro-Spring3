package com.coderbd.repo;

import com.coderbd.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String roleName);
    boolean existsRoleByRoleName(String roleName);
}
