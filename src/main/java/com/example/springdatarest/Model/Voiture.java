package com.example.springdatarest.Model;
import javax.persistence.*;
import lombok.*;
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor



public class Voiture {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proprietaire")
    @NonNull
    private Proprietaire proprietaire;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @NonNull
    private String marque;
    @NonNull
    private String modele;
    @NonNull
    private String couleur;
    @NonNull
    private String immatricule;
    @NonNull
    private int annee;
    @NonNull
    private int prix;
}
