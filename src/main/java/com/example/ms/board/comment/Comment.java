package com.example.ms.board.comment;

import com.example.ms.board.post.Post;
import com.example.ms.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    @ManyToOne
    private User writer;

    private LocalDateTime createDate;

    @ManyToOne
    private Post post;
}
