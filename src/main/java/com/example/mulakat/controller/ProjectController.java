package com.example.mulakat.controller;

import com.example.mulakat.model.Project;
import com.example.mulakat.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ProjectController {
    private ProjectService projectService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Project saveProject(@RequestBody Project project) {
        return projectService.save(project);
    }
}
