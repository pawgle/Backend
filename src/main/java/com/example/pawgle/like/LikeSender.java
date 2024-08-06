package com.example.pawgle.like;

import com.example.pawgle.user.User;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

/**
 * 내가 호감 표시 보낸 사람
 */
@Entity
@NoArgsConstructor
public class LikeSender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_sender_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User sender;

}
