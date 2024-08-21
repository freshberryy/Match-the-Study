package com.example.ms.group.member;

import com.example.ms.group.UserGroup;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private UserGroup group;

    private LocalDateTime inDate;
}
