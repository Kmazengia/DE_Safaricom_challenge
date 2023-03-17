package com.kefalebootstring.springtest.test;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class employee {
    public employee() {
    }

    public employee(int id, String name, String title, String department) {
        this.id = id;
        this.name = name;
	this.title = title;
	this.department = department;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String title;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }

   public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
     public String getDepartment() {
        return departement;
    }

    public void setDepartment(String department) {
        this.department = department;
    }}

