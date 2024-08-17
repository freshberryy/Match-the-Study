package com.example.ms.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {
    @Autowired
    private GroupService groupService;
}
