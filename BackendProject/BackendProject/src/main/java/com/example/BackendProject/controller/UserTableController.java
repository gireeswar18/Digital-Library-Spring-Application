package com.example.BackendProject.controller;

import com.example.BackendProject.domainObjects.UserTablePojo;
import com.example.BackendProject.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserTableController {

    @Autowired
    UserTableService userTableService;

    @GetMapping(path = "/getUserTable")
    public void getUserTable ()
    {
        userTableService.getUserTable();
    }

    @PostMapping(path = "/createUser")
    public void createUser (@RequestBody UserTablePojo userTablePojo)
    {
        userTableService.createUser(userTablePojo);
    }

    @PostMapping(path = "/updateUser")
    public void updateUser (@RequestBody UserTablePojo userTablePojo)
    {
        userTableService.updateUser(userTablePojo);
    }

    @PostMapping(path = "/getUsersWhoCrossedDate")
    public void getUsersWhoCrossedDate (@RequestParam String bookReceived)
    {
        userTableService.getUsersWhoCrossedDate(bookReceived);
    }
}
