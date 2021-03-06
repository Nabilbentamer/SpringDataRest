package com.example.springdatarest.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor



public class Proprietaire {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)


        private long id;
        @NonNull
        private String nom;
        @NonNull
        private String prenom;
        @JsonIgnore

        @OneToMany(cascade = CascadeType.ALL, mappedBy="proprietaire")
        private List<Voiture> voitures;
}
