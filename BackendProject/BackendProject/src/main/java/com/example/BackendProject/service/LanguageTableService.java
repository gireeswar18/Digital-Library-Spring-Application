package com.example.BackendProject.service;

import com.example.BackendProject.domainObjects.LanguageTablePojo;
import com.example.BackendProject.entity.LanguageTable;
import com.example.BackendProject.repository.LanguageTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageTableService {

    @Autowired
    LanguageTableRepository languageTableRepository;

    public void getLanguageTable ()
    {
        List<LanguageTable> languageTableList = languageTableRepository.findAll();
        System.out.println("Available Languages Are: ");
        for (LanguageTable language : languageTableList)
        {
            System.out.println("Language Id: " + language.getLanguageId());
            System.out.println("Language Name: " + language.getLanguageName());
            System.out.println("--------------------------------");
        }
    }

    public void createLanguage (LanguageTablePojo languageTablePojo)
    {
        LanguageTable language = new LanguageTable();
        language.setLanguageId(languageTablePojo.getLanguageId());
        language.setLanguageName(languageTablePojo.getLanguageName());
        languageTableRepository.save(language);
        System.out.println("Language Saved Successfully...");
    }

    public void updateLanguage (LanguageTablePojo languageTablePojo)
    {
        LanguageTable language = languageTableRepository.getReferenceById(languageTablePojo.getLanguageId());
        language.setLanguageName(languageTablePojo.getLanguageName());
        languageTableRepository.save(language);
        System.out.println("Language Updated Successfully...");
    }


}
