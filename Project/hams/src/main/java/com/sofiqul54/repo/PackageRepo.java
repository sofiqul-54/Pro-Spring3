package com.sofiqul54.repo;

import com.sofiqul54.entity.Ppackage;
<<<<<<< HEAD
=======
import com.sofiqul54.entity.Role;
>>>>>>> 0128f2e59f25db4e282b956676e44969f7d523f0
import com.sofiqul54.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PackageRepo extends JpaRepository<Ppackage, Long> {
    Optional<Ppackage> findByName(String name);
    boolean existsByName(String name);
}
