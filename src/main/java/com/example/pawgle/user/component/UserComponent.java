package com.example.pawgle.user.component;

import com.example.pawgle.common.Question;
import com.example.pawgle.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_component_id")
    private Long id;
    private String title;
    private String content;
    private Question qType;
    private String url;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
