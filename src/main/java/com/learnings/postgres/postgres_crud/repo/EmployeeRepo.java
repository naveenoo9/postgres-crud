package com.learnings.postgres.postgres_crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnings.postgres.postgres_crud.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
