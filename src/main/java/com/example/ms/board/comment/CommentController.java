package com.example.ms.board.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
}
