package com.tnsif.collegeservice.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;
    private String University;
    private String principalName;
    private int establishedYear;
    private int studentCount;
    private String accredation;


    public Student() {}

    public Student(String name, String location, int establishedyear, int StudentCount, String university, 
                  String principalName, String accreditation) {
        this.name = name;
        this.department = department;
        this.year = year;


    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}



