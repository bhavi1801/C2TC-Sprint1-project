package com.tnsif.collegesrvice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.collegesrvice.entity.CollegeEntity;

public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
    
}
