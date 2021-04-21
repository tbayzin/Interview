package com.example.mulakat.model;

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
public class Project {
    @Id
    @GeneratedValue
    private   Integer id;
    private String name;


    @ManyToMany(mappedBy = "projects", fetch = FetchType.EAGER)
    private List<User> users;


}
