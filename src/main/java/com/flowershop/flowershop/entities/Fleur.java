package com.flowershop.flowershop.entities;

import jakarta.persistence.*;

@Entity
public class Fleur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nom;
    private String Couleur;
    private Long Prix;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    public Fleur() {
        super();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public Long getPrix() {
        return Prix;
    }

    public void setPrix(Long prix) {
        Prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Fleur(Long id, String nom, String couleur, Long prix, String image) {
        Id = id;
        Nom = nom;
        Couleur = couleur;
        Prix = prix;
        this.image = image;
    }
}
