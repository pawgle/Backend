package com.example.pawgle.user;

import com.example.pawgle.common.Gender;
import com.example.pawgle.like.Like;
import com.example.pawgle.pet.Pet;
import com.example.pawgle.user.component.UserComponent;
import com.example.pawgle.user.image.UserImage;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Email
    private String email;
    private String name;
    private String password;
    private Gender gender;
    private String job;
    private String birthDay;
    private String age;
    private String area;
    private String mbti;
    private int keyCnt;     //열쇠 수

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserImage> userImages = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<UserComponent> userComponents = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ideal_type_id")
    private IdealType idealType;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<BlackUser> blackUsers = new ArrayList<>();

    @OneToMany(mappedBy = "receiver", fetch = FetchType.LAZY)
    private List<Like> likeReceivers = new ArrayList<>();

    @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY)
    private List<Like> likeSenders = new ArrayList<>();
}

