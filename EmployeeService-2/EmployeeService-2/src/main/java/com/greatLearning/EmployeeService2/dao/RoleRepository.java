package com.greatLearning.EmployeeService2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.EmployeeService2.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
