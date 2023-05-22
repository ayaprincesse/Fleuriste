package com.flowershop.flowershop.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nom;
    private String Prenom ;

    public Client() {
        super();
    }
    public Client(Long id, String nom, String prenom, String telephone, String username, String password) {
        Id = id;
        Nom = nom;
        Prenom = prenom;
        Telephone = telephone;
        Username = username;
        Password = password;
    }

    public void setId(Long id) {
        Id = id;
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

    private String Telephone ;
    private String Username ;
    private String Password ;

    public Long getId() {
        return Id;
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
}
