package com.example.mulakat.repository;

import com.example.mulakat.dto.ProjectSumsDTO;
import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = " SELECT MAX(salary) as max_salary\n" +
            "FROM user;",
            nativeQuery=true
    )
    public Optional<User> highestSalary (String title, String description);

    /*
    SELECT MAX(salary) as max_salary
FROM user;
     */
    User getUserById(Integer id);

    public List<User> findByName(String name);



    //@Query(value = "select pr.name as projectName, SUM(u.salary) as totalSalary  from user_project p left join user u on u.id=p.user_id left join project pr on p.project_id = pr.id group by pr.name", nativeQuery = true)
    //List<ProjectSumsDTO> sumAllSalaries ();

}
