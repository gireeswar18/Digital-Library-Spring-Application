package com.example.BackendProject.controller;

import com.example.BackendProject.domainObjects.LanguageTablePojo;
import com.example.BackendProject.service.LanguageTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageTableController {

    @Autowired
    LanguageTableService languageTableService;

    @GetMapping(path = "/getLanguageTable")
    public void getLanguageTable ()
    {
        languageTableService.getLanguageTable();
    }

    @PostMapping(path = "/createLanguage")
    public void createLanguage (@RequestBody LanguageTablePojo languageTablePojo)
    {
        languageTableService.createLanguage(languageTablePojo);
    }

    @PostMapping(path = "/updateLanguage")
    public void updateLanguage (@RequestBody LanguageTablePojo languageTablePojo)
    {
        languageTableService.updateLanguage(languageTablePojo);
    }
}
