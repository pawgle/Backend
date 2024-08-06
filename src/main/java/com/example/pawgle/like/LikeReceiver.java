package com.example.pawgle.like;

import com.example.pawgle.user.User;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

/**
 * 나를 호감 표시 한 사
 */
@Entity
@NoArgsConstructor
public class LikeReceiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_receiver_id")
    private Long id;

    //호감 보낸 사람
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User receiver;

}
