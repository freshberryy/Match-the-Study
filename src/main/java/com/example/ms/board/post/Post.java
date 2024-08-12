package com.example.ms.board.post;

import com.example.ms.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User writer;

    private String title;

    private String content;

    private LocalDateTime createDate;
}
