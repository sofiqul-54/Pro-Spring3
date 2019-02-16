package com.sofiqul54.repository;


import com.sofiqul54.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository <Role, Long> {
    Role findByRoleName(String roleName);
}
