package com.example.ms.group;

import com.example.ms.group.category.Category;
import com.example.ms.group.member.Member;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@ㅇㅁ@Data
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String groupName;

    @OneToOne
    private Category category;

    private String description;

    private Integer max;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "group", cascade = CascadeType.REMOVE)
    private List<Member> members;
}
