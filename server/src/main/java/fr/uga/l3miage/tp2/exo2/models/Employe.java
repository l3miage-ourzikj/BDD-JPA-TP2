package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  class Employe {
    @Id
    private Long id;
    private String nom;
    private String email;
    private Double salaire;
}
