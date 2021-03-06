package com.example.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="Department")
public class Department {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "department_id")
    private  long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private Collection<Student> students;

    @OneToMany(mappedBy = "department")
    private Collection<Instructor> instructors;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(joinColumns = @JoinColumn(name="department_id"),
            inverseJoinColumns = @JoinColumn(name="course_id"))
    private Collection<Course> courses;

    public Department() {
    }

    public Department(String name, Collection<Student> students, Collection<Instructor> instructors, Collection<Course> courses) {
        this.name = name;
        this.students = students;
        this.instructors = instructors;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
