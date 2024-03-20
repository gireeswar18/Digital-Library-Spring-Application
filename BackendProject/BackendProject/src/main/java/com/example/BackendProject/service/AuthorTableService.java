package com.example.BackendProject.service;

import com.example.BackendProject.domainObjects.AuthorTablePojo;
import com.example.BackendProject.entity.AuthorTable;
import com.example.BackendProject.repository.AuthorTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorTableService {

    @Autowired
    AuthorTableRepository authorTableRepository;

    public void getAuthorTable ()
    {
        List<AuthorTable> authorTableList = authorTableRepository.findAll();
        System.out.println("Authors are: ");
        for (AuthorTable author : authorTableList)
        {
            System.out.println("Author ID: " + author.getAuthorId());
            System.out.println("Author Name: " + author.getAuthorName());
            System.out.println("--------------------------------");
        }
    }

    public void createAuthor (AuthorTablePojo authorTablePojo)
    {
        AuthorTable authorTable = new AuthorTable();
        authorTable.setAuthorId(authorTablePojo.getAuthorId());
        authorTable.setAuthorName(authorTablePojo.getAuthorName());
        authorTableRepository.save(authorTable);
        System.out.println("Author Created Successfully...");
    }

    public void updateAuthor (AuthorTablePojo authorTablePojo)
    {
        AuthorTable authorTable = authorTableRepository.getReferenceById(authorTablePojo.getAuthorId());
        authorTable.setAuthorName(authorTablePojo.getAuthorName());
        authorTableRepository.save(authorTable);
        System.out.println("Author Updated Successfully...");
    }

}
