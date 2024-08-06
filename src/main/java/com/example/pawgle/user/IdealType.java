package com.example.pawgle.user;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class IdealType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ideal_type_id")
    private Long id;

    private String age;
    private String height;
    private String job;
    private String education;
    private String smoke;
    private String alcohol;
    private String religion;
    private String mbti;
    private String child;
    private String location;
    private String living;
    private String sibling;

}
