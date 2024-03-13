package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "developer_miage")
public class developer_miage {
    @Id
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "developers")
    private ArrayList<Projet> projets;
}
