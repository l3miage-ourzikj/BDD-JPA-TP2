package fr.uga.l3miage.tp2.exo2.models;


import javax.persistence.Entity;

@Entity
public class Developer extends Employe {
    private String langagePrefere;
    private  String niveauCompetence;
}
