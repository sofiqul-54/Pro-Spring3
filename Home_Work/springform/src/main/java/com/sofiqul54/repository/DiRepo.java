package com.sofiqul54.repository;

import com.sofiqul54.entity.DateImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiRepo extends JpaRepository<DateImage, Long> {
}
