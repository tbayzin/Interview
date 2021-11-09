package com.example.mulakat.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue
    private   Integer id;
    private   String name;
    private   String surname;
    private  Double salary;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "user_project",
            joinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id",
                            nullable = false, updatable = true)},
            inverseJoinColumns = {
                    @JoinColumn(name = "project_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private List<Project> projects;
}


/*

@Query(
  value = "Select SUM(u.salary), pr.name from user_project p left join user u on u.id=p.user_id
left join project pr on p.project_id = pr.id
group by pr.name;",
  nativeQuery = true)
Collection<Project> getProjectSums();

 */