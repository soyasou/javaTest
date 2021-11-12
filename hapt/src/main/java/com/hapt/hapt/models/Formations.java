package com.hapt.hapt.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formations")
public class Formations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = false, length = (50))
    private String name;
    @Column(nullable = false, unique = true, length = 60)
    private String description;
    @Column(nullable = false, unique = false, length = 60)
    private Date dateDebut;
    @Column(nullable = false, unique = true, length = 45)
    private Date dateFin;
    @Column(nullable = false, unique = false, length = 60)
    private String duree;
    @Column(nullable = false, unique = true, length = 10)
    private int nbHeurs;
    @Column(nullable = false, unique = true, length = 10)
    private float prix;
    @Column(nullable = false, unique = false, length = 10)
    private String formateur;

    public Formations() {

    }

    public Formations(Long id) {
        this.id = id;
    }

    public Formations(String name, String description, Date dateDebut, Date dateFin, String duree, int nbHeurs,
            float prix, String formateur) {
        this.name = name;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.duree = duree;
        this.nbHeurs = nbHeurs;
        this.prix = prix;
        this.formateur = formateur;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getNbHeurs() {
        return nbHeurs;
    }

    public void setNbHeurs(int nbHeurs) {
        this.nbHeurs = nbHeurs;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }
}
