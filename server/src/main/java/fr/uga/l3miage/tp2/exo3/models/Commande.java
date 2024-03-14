package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Commande {
    @Id
    private Long id;

    private Date date;
    private Double montantTotal;

    @ManyToOne
    private Client client;

    @OneToMany
    private ArrayList<Produit> produits;

}
