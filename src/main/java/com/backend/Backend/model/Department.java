package com.backend.Backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Department {
    @Id
    @Column(name="dept_id")
    private int id;

    @Column(nullable = false)
    private String name;

    private Date established;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
