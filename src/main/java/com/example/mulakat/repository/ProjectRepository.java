package com.example.mulakat.repository;


import com.example.mulakat.dto.ProjectSumsDTO;
import com.example.mulakat.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public interface ProjectRepository extends JpaRepository<Project,  Integer> {
    Project getProjectById(Integer id);


    //  Collection<Project> getProjectSums();


    /*
    @Query(value = "select new com.example.mulakat.dto.ProjectSumsDTO(pr.name, SUM(u.salary)) from UserProject p left join User u on u.id=p.user_id left join Project pr on p.project_id = pr.id group by pr.name")
    List<ProjectSumsDTO> sumAllSalaries();

     */
}
