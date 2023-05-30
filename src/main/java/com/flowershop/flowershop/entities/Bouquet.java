package com.flowershop.flowershop.entities;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.IdentifiableType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mockito.internal.invocation.SerializableMethod;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bouquet")
public class Bouquet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBouquet;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String Image;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "bouquet_fleur",
            joinColumns = @JoinColumn(name = "bouquet_id", referencedColumnName = "idBouquet", nullable = false, updatable = false),
            inverseJoinColumns = @JoinColumn(name = "fleur_id", referencedColumnName = "idFleur", nullable = false, updatable = false))
    private Set<Fleur> fleurlist=new HashSet<>();
    private BouquetType typebouquet;
    public Bouquet (BouquetType typebouquet){
        this.typebouquet=typebouquet;}
}
