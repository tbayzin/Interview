package com.example.mulakat.repository;

import com.example.mulakat.model.Project;
import com.example.mulakat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {
    User getUserById(Integer id);

    @Query("Select SUM(u.salary), pr.name from user_project p left join user u on u.id=p.user_id " +
            "            left join project pr on p.project_id = pr.id\n" +
            "            group by pr.name")
    List<User> sumallsallaries ();
}
