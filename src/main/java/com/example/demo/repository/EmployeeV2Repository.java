package com.example.demo.repository;

import com.example.demo.entity.EmployeeV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeV2Repository extends JpaRepository<EmployeeV2, Long> {
}
