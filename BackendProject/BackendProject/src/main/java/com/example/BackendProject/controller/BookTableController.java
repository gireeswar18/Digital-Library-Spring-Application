package com.example.BackendProject.controller;

import com.example.BackendProject.domainObjects.BookTablePojo;
import com.example.BackendProject.entity.BookTable;
import com.example.BackendProject.service.BookTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookTableController {

    @Autowired
    BookTableService bookTableService;

    @GetMapping(path = "/getBookTable")
    public void getBookTable ()
    {
        bookTableService.getBookTable();
    }

    @PostMapping(path = "/createBook")
    public void createBook (@RequestBody BookTablePojo bookTablePojo)
    {
        bookTableService.createBook(bookTablePojo);
    }

    @PostMapping(path = "/updateBook")
    public void updateBook (@RequestBody BookTablePojo bookTablePojo)
    {
        bookTableService.updateBook(bookTablePojo);
    }

    @PostMapping(path = "/getBookUsingAuthorId")
    public void getBookUsingAuthorId (@RequestParam int authorId)
    {
        bookTableService.getBookusingAuthorId(authorId);
    }

    @PostMapping(path = "/getBookUsingAuthor")
    public void getBookUsingAuthor (@RequestParam String authorName)
    {
        bookTableService.getBookUsingAuthor(authorName);
    }

    @PostMapping(path = "/getBookByLanguageId")
    public void getBookByLanguageId (@RequestParam int languageId)
    {
        bookTableService.getBookByLanguageId(languageId);
    }

    @PostMapping(path = "/getBookByLanguage")
    public void getBookByLanguage (@RequestParam String language)
    {
        bookTableService.getBookByLanguage(language);
    }

    @PostMapping(path = "/getBookByRating")
    public void getBookByRating (@RequestParam int rating)
    {
        bookTableService.getBookByRating(rating);
    }

}
