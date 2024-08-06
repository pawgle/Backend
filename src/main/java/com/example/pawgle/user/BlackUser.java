package com.example.pawgle.user;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class BlackUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_image_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
