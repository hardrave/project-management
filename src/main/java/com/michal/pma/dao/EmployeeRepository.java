package com.michal.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.michal.pma.entities.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}

