package com.example.BackendProject.service;

import com.example.BackendProject.domainObjects.BookTablePojo;
import com.example.BackendProject.entity.AuthorTable;
import com.example.BackendProject.entity.BookTable;
import com.example.BackendProject.entity.LanguageTable;
import com.example.BackendProject.entity.UserTable;
import com.example.BackendProject.repository.AuthorTableRepository;
import com.example.BackendProject.repository.BookTableRepository;
import com.example.BackendProject.repository.LanguageTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTableService {

    @Autowired
    BookTableRepository bookTableRepository;

    @Autowired
    AuthorTableRepository authorTableRepository;

    @Autowired
    LanguageTableRepository languageTableRepository;

    public void getBookTable ()
    {
        List<BookTable> bookTableList = bookTableRepository.findAll();
        System.out.println("Books Available Are:");
        for (BookTable book : bookTableList)
        {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Book Author: " + book.getAuthorTable().getAuthorName());
            System.out.println("Book Language: " + book.getLanguageTable().getLanguageName());
            System.out.println("Book Rating: " + book.getRating());
            List<UserTable> userTableList = book.getUserTableList();
            System.out.println("Book Rented By: ");
            if (userTableList.size() != 0)
            {
                int sno = 1;
                for (UserTable user : userTableList) {
                    System.out.println(sno++ + ". " + user.getUserName());
                }
                System.out.println("----------------------------------");
            }
            else
            {
                System.out.println("No one!");
                System.out.println("----------------------------------");
            }
        }
    }

    public void createBook (BookTablePojo bookTablePojo)
    {
        BookTable book = new BookTable();
        book.setBookId(bookTablePojo.getBookId());
        book.setBookName(bookTablePojo.getBookName());
        AuthorTable author = new AuthorTable();
        author.setAuthorId(bookTablePojo.getAuthorTable().getAuthorId());
        author.setAuthorName(bookTablePojo.getAuthorTable().getAuthorName());
        book.setAuthorTable(author);
        LanguageTable language = new LanguageTable();
        language.setLanguageId(bookTablePojo.getLanguageTable().getLanguageId());
        language.setLanguageName(bookTablePojo.getLanguageTable().getLanguageName());
        book.setLanguageTable(language);
        book.setRating(bookTablePojo.getRating());
        bookTableRepository.save(book);
        System.out.println("Book Saved Successfully...");
    }

    public void updateBook (BookTablePojo bookTablePojo)
    {
        BookTable book = bookTableRepository.getReferenceById(bookTablePojo.getBookId());
        book.setBookName(bookTablePojo.getBookName());
        AuthorTable author = new AuthorTable();
        author.setAuthorId(bookTablePojo.getAuthorTable().getAuthorId());
        author.setAuthorName(bookTablePojo.getAuthorTable().getAuthorName());
        book.setAuthorTable(author);
        LanguageTable language = new LanguageTable();
        language.setLanguageId(bookTablePojo.getLanguageTable().getLanguageId());
        language.setLanguageName(bookTablePojo.getLanguageTable().getLanguageName());
        book.setLanguageTable(language);
        book.setRating(bookTablePojo.getRating());
        bookTableRepository.save(book);
        System.out.println("Book Updated Successfully...");
    }

    public void getBookusingAuthorId (int authorId)
    {
        AuthorTable author = authorTableRepository.getReferenceById(authorId);
        List<BookTable> bookTableList = author.getBookTableList();
        System.out.println("Author Id: " + author.getAuthorId());
        System.out.println("Author Name: " + author.getAuthorName());
        int index = 1;
        System.out.println("Books of this author are: ");
        for (BookTable book : bookTableList)
        {
            System.out.println(index++ + ". " + book.getBookName());
            System.out.println("Book Id: " + book.getBookId());
            System.out.println("Book Language: " + book.getLanguageTable().getLanguageName());
            System.out.println("Book Rating: " + book.getRating());
            System.out.println("---------------------------------");
        }
    }

    public void getBookUsingAuthor (String authorName)
    {
        List<BookTable> bookTableList = bookTableRepository.getByAuthorTableAuthorName(authorName);
        System.out.println("Books of " + authorName + " are: ");
        int index = 1;
        for (BookTable book : bookTableList)
        {
            System.out.println(index++ + ". " + book.getBookName());
        }
        System.out.println("--------------------------------");
    }

    public void getBookByLanguageId (int languageId)
    {
        LanguageTable languageTable = languageTableRepository.getReferenceById(languageId);
        List<BookTable> bookTableList = languageTable.getBookTableList();
        System.out.println("Language: " + languageTable.getLanguageName());
        System.out.println("Books in this language are: ");
        int index = 1;
        for (BookTable book : bookTableList)
        {
            System.out.println(index++ + ". " + book.getBookName());
        }
        System.out.println("------------------------------------");
    }

    public void getBookByLanguage (String languageName)
    {
        List<BookTable> bookTableList =  bookTableRepository.getByLanguageTableLanguageName(languageName);
        System.out.println("Books in " + languageName + " are: ");
        int index = 1;
        for (BookTable book : bookTableList)
        {
            System.out.println(index++ + ". " + book.getBookName());
        }
        System.out.println("------------------------------------");
    }

    public void getBookByRating (int rating)
    {
        List<BookTable> bookTableList = bookTableRepository.getByRating(rating);
        System.out.println("Books with rating " + rating + " are: ");
        int index = 1;
        for (BookTable book : bookTableList)
        {
            System.out.println(index++ + ". " + book.getBookName());
        }
        System.out.println("------------------------------------");
    }
}
