package com.example.mulakat.repository;


import com.example.mulakat.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProjectRepository extends JpaRepository<Project,  Integer> {
    Project getProjectById(Integer id);

    @Query("Select SUM(u.salary), pr.name from user_project p left join user u on u.id=p.user_id
            left join project pr on p.project_id = pr.id
            group by pr.name")

  //  Collection<Project> getProjectSums();

}
