package com.example.pawgle.pet.image;

import com.example.pawgle.pet.Pet;
import com.example.pawgle.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PetImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_image_id")
    private Long id;
    private String url;
    private int orderNum;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
