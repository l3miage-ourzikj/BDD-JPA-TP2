package fr.uga.l3miage.tp2.exo1.models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

@Entity
@Table(name = "projet")
public class Projet {
    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @ManyToMany
    private ArrayList<developer_miage> developers;
}
