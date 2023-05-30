package com.flowershop.flowershop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fleur")
public class Fleur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFleur;
    private String nomFleur;
    private Long prixFleur;
    private String couleurFleur;

    @ManyToMany(mappedBy = "fleurlist", fetch = FetchType.LAZY)
    private Set<Bouquet> listbouquet=new HashSet<>();

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String imageFleur;

    public Fleur (String nomFleur,Long prixFleur,String couleurFleur){
        this.nomFleur=nomFleur;
        this.prixFleur=prixFleur;
        this.couleurFleur=couleurFleur;
    }

}