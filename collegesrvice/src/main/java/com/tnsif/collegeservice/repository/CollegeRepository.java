package com.tnsif.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.college.entity.CollegeEntity;

public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
    
}
