package com.example.pawgle.pet.component;

import com.example.pawgle.common.Question;
import com.example.pawgle.pet.Pet;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
public class PetComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_component_id")
    private Long id;
    private String title;
    private String content;
    private Question qType;
    private String url;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @RequiredArgsConstructor
    public enum Type {
        LONG("장문형"),
        SHORT("단답형");

        private final String info;
    }
}
