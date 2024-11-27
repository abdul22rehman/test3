package com.airbnb.bnb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "appuser")
public class Appuser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 //   @Column(name = "name", nullable = false)
    private String name;

  //  @Column(name = "username", nullable = false, unique = true)
    private String username;

  //  @Column(name = "email", nullable = false, unique = true, length = 250)
    private String email;

  //  @Column(name = "password", nullable = false, unique = true, length = 100)
    private String password;

    // Getter and Setter for 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'username'
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
