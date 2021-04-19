package com.example.mulakat.dao;


import com.example.mulakat.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    Project getProjectById(Integer id);
}
