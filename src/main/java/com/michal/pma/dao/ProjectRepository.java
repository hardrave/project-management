package com.michal.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.michal.pma.entities.Project;



public interface ProjectRepository extends CrudRepository<Project, Long>{

}
