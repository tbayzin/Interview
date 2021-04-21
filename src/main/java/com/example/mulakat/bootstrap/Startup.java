package com.example.mulakat.bootstrap;

import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import com.example.mulakat.service.ProjectService;
import com.example.mulakat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
public class Startup implements CommandLineRunner {
    private final UserService service;
    private final ProjectService projectService;

    @Override
    public void run(String... args) throws Exception {
     /*   User user1 = User.builder().id(1).name("Tarik").surname("Bin Ziyad").salary(6000d).build();
        User user3 = User.builder().id(3).name("Osman").surname("Nuri").salary(4000d).build();*/

        User user1 = new User();
        user1.setName("Tarık");
        user1.setSurname("Kral");
        user1.setSalary(2500.00);

        User user2 = new User();
        user2.setName("Mehmet");
        user2.setSurname("Sen");
        user2.setSalary(3500.00);

        User user3 = new User();
        user3.setName("Murat");
        user3.setSurname("Sahin");
        user3.setSalary(7500.00);



        service.save(user1);
        service.save(user2);
        service.save(user3);

       /* Project project1 = Project.builder().id(1).name("Cebeli Tarik Projesi").build();

        Project project3 = Project.builder().id(3).name("Plevne Savunma si Projesi").build();*/

        Project projectNew = new Project();
        projectNew.setName("Plevne Savunmasi Projesi");

        Project projectNew2 = new Project();
        projectNew2.setName("Cebeli Tarik Projesi");


        projectService.save(projectNew);
        projectService.save(projectNew2);



            // Userların projelere eklendigi kisim
        if(user1.getProjects()!=null){
            user1.getProjects().add(projectNew);
        }
        else {
            List<Project> projectList = new ArrayList<>();
            projectList.add(projectNew);
            user1.setProjects(projectList);
        }
        service.save(user1);


        if(user2.getProjects()!=null){
            user2.getProjects().add(projectNew2);
        }
        else {
            List<Project> projectList = new ArrayList<>();
            projectList.add(projectNew2);
            user2.setProjects(projectList);
        }
        service.save(user2);

        if(user3.getProjects()!=null){
            user3.getProjects().add(projectNew2);
        }
        else {
            List<Project> projectList = new ArrayList<>();
            projectList.add(projectNew2);
            user3.setProjects(projectList);
        }
        service.save(user3);





        // https://attacomsian.com/blog/spring-data-jpa-many-to-many-mapping

    }
}