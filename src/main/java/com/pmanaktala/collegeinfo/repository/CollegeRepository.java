package com.pmanaktala.collegeinfo.repository;

import com.pmanaktala.collegeinfo.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
