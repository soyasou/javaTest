package com.hapt.hapt.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = false, length = (50))
    private String name;
    @Column(nullable = false, unique = false, length = 60)
    private String prenom;
    @Column(nullable = false, unique = false, length = 60)
    private String password;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(nullable = false, unique = false, length = 150)
    private String adresse;
    @Column(nullable = false, unique = true, length = 10)
    private String tel;
    @Column(nullable = false, unique = true, length = 10)
    private String cin;
    @Column(nullable = false, unique = false, length = 10)
    private Date dateN;
    @Column(nullable = false, unique = false, length = 10)
    private int active;
    @Column(nullable = false, unique = false, length = 45)
    private String role;

    public User() {

    }

    public User(Long id) {
        this.id = id;
    }

    public User(String name, String email, String role, String adresse, String password, int active) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.adresse = adresse;
        this.password = password;
        this.active = active;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCin() {
        return prenom;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}