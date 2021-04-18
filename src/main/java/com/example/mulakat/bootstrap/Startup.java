package com.example.mulakat.bootstrap;

import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import com.example.mulakat.service.ProjectService;
import com.example.mulakat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Startup implements CommandLineRunner {
    private final UserService service;
    private final ProjectService projectService;

    @Override
    public void run(String... args) throws Exception {
        User user1 = User.builder().id(1).name("Tarik").surname("bin Ziyad").salary(6000d).build();
        User user2 = User.builder().id(2).name("Tarik2").surname("bin Ziyad").salary(4000d).build();
        User user3 = User.builder().id(3).name("Tarik3").surname("bin Ziyad").salary(5000d).build();

        service.save(user1);
        service.save(user2);
        service.save(user3);

        Project project1 = Project.builder().id(1).name("").build();
        Project project3 = new Project("Web Basics", "WB", 10, 0);

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);

        // https://attacomsian.com/blog/spring-data-jpa-many-to-many-mapping

    }
}
