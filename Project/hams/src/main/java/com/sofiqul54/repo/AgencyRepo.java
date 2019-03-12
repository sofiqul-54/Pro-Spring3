package com.sofiqul54.repo;

import com.sofiqul54.entity.AgencyInfo;
import com.sofiqul54.entity.Role;
import com.sofiqul54.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgencyRepo extends JpaRepository<AgencyInfo, Long> {
    Optional<AgencyInfo> findByEmail(String email);
    Optional<AgencyInfo> findByAgnName(String agnName);
    boolean existsByEmail(String email);

}
