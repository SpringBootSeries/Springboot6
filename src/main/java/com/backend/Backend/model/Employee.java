package com.backend.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Employee {
    @Id
    private String empNo;
    private String name;
    private int age;
    private double salary;
    private String gender;

    @ManyToOne
    private Department department;

    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;


}
