package com.tnsif.collegeservice.repository;




import com.tnsif.collegeservice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

