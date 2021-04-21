package com.example.mulakat.dao;


import com.example.mulakat.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,  Integer> {
    Project getProjectById(Integer id);
}
