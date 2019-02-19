package com.sofiqul54.loginsecure.repository;

import com.sofiqul54.loginsecure.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
