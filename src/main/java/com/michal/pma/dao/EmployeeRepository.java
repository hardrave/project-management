package com.michal.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.michal.pma.entities.Employee;
import com.michal.pma.entities.Project;



public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	@Override
	public List<Employee> findAll();
	
	
}

