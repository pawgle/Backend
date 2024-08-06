package com.example.pawgle.pet;

import com.example.pawgle.common.Gender;
import com.example.pawgle.pet.component.PetComponent;
import com.example.pawgle.pet.image.PetImage;
import com.example.pawgle.user.image.UserImage;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Pet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Long id;
    private String name;
    private Gender gender;
    private String birthDay;
    private String age;
    private String type;
    private String species;

    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY)
    private List<PetImage> petImages = new ArrayList<>();

    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY)
    private List<PetComponent> petComponents = new ArrayList<>();
}
