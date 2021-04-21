package com.example.mulakat.controller;

import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import com.example.mulakat.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/projects")
public class ProjectController {

    private final ProjectService projectService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Project saveProject(@RequestBody Project project) {
        return projectService.save(project);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Project> getAll() {
        return projectService.getAllProjects();
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Project getProjectById (@PathVariable Integer id) {
        return projectService.getProjectByID(id);
    }

}
