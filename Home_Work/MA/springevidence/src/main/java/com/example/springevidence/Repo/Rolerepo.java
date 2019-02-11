package com.example.springevidence.Repo;

import com.example.springevidence.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rolerepo extends JpaRepository<Role, Long> {

        Role findByRolename(String rolename);
}
