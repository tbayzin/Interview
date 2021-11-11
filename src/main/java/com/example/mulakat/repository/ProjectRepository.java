package com.example.mulakat.repository;


import com.example.mulakat.dto.ProjectSumsDTO;
import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository
public interface ProjectRepository extends CrudRepository<Project,  Integer> {
    Project getProjectById(Integer id);



    //  Collection<Project> getProjectSums();


    /*
    @Query(value = "SELECT * FROM user where name = 'Murat' ")
    List<ProjectSumsDTO> sumAllSalaries();
    */


}
