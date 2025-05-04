package com.backend.Backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
public class Project {
    @Id
    @Column(name = "project_id")
    private int id;
    @Column(name = "project_name")
    private String name;
    @Column(name = "project_cost")
    private long totalcost;
    @ManyToMany
    private List<Employee>employees;


}
