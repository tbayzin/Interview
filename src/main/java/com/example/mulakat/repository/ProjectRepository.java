package com.example.mulakat.repository;


import com.example.mulakat.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,  Integer> {
    Project getProjectById(Integer id);


    //  Collection<Project> getProjectSums();

}
