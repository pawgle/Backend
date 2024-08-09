package com.example.pawgle.like;

import com.example.pawgle.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 호감 표시
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private Long id;

    //나한테 호감 보낸 사람
    @ManyToOne
    @JoinColumn(referencedColumnName = "user_id", name = "sender_id")
    private User sender;
    
    //내가 호감 보낸 사람
    @ManyToOne
    @JoinColumn(referencedColumnName = "user_id",name = "receiver_id")
    private User receiver;

}
