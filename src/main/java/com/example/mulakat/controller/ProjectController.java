package com.example.mulakat.controller;

import com.example.mulakat.dto.ProjectSumsDTO;
import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import com.example.mulakat.service.ProjectService;
import com.example.mulakat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/projects")
public class ProjectController {

    private final ProjectService projectService;
    private final UserService userService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public Project saveProject(@RequestBody Project project) {
        return projectService.save(project);
    }




    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Project getProjectById (@PathVariable Integer id) {
        return projectService.getProjectByID(id);
    }






    /*
    // burdaki dönüş değiştirilecek
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/listProjectSums")
    public List<Project> listProjectSums () {
        return  projectService.sumAllSalaries();
    }
     */



}

