package com.example.mulakat.service;


import com.example.mulakat.dao.ProjectRepository;
import com.example.mulakat.dao.UserRepository;
import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
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

    public List<Project> getAllProjects() {
        return projectRrepository.findAll();
    }

}
