package com.example.BackendProject.controller;

import com.example.BackendProject.domainObjects.AuthorTablePojo;
import com.example.BackendProject.service.AuthorTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorTableController {

    @Autowired
    AuthorTableService authorTableService;

    @GetMapping(path = "/getAuthorTable")
    public void getAuthorTable ()
    {
        authorTableService.getAuthorTable();
    }

    @PostMapping(path = "/createAuthor")
    public void createAuthor (@RequestBody AuthorTablePojo authorTablePojo)
    {
        authorTableService.createAuthor(authorTablePojo);
    }

    @PostMapping(path = "/updateAuthor")
    public void updateAuthor (@RequestBody AuthorTablePojo authorTablePojo)
    {
        authorTableService.updateAuthor(authorTablePojo);
    }

}
