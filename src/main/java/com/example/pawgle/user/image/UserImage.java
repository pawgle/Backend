package com.example.pawgle.user.image;

import com.example.pawgle.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_image_id")
    private Long id;
    private String url;
    private int orderNum;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
