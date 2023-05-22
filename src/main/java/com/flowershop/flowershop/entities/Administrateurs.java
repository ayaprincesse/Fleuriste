package com.flowershop.flowershop.entities;

import jakarta.persistence.*;

@Entity
public class Administrateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAdmin;
    @Column(name = "nom")
    private String Nom;
    @Column(name = "prenom")
    private String Prenom ;
    @Column(name = "telephone")
    private String Telephone;
    @Column(name = "username")
    private String Username ;
    @Column(name = "password")
    private String Password ;
    public Long getIdAdmin() {
        return IdAdmin;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setId(Long id) {
        IdAdmin = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Administrateurs( String nom, String prenom, String telephone, String username, String password) {
        Nom = nom;
        Prenom = prenom;
        Telephone = telephone;
        Username = username;
        Password = password;
    }

    public Administrateurs() {
        super();
    }

    @Override
    public String toString() {
        return "Administrateurs{" +
                "Id=" + IdAdmin +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
