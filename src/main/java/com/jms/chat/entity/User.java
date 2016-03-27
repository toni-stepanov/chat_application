package com.jms.chat.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 3, message = "Name must be at least 3 characters!")
    @Column(unique = true)
    private String name;

    @Size(min = 1, message = "Invalid email address!")
    @Email(message = "Invalid email address!")
    private String email;

    @Size(min = 5, message = "Name must be at least 5 characters!")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}