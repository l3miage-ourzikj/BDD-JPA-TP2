package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

    @Id
    private Long id;
    private String nom;
    private Double prix;

    private int quantite;

    @ManyToOne
    private CategorieDeProduit categorie;
}
