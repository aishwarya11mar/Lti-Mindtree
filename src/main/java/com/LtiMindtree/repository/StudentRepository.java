package com.LtiMindtree.repository;

import com.LtiMindtree.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
