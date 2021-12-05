package com.example.mulakat.service;


import com.example.mulakat.model.User;
import com.example.mulakat.repository.ProjectRepository;
import com.example.mulakat.model.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRrepository;

    public Project save(Project project) {
        return projectRrepository.save(project);
    }

    public Project getProjectByID(Integer id) {
        return projectRrepository.getProjectById(id);
    }

    /*
    public List<Project> getAllProjects() {
        return projectRrepository.findAll();
    }

     */

    /*
    // Sum according to sallaries
    public List<Project> sumAllSalaries() {
        return  projectRrepository.sumAllSalaries();
    }
     */

}
