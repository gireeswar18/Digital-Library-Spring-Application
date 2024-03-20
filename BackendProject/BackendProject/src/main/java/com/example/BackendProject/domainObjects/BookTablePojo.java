package com.example.BackendProject.domainObjects;

import com.example.BackendProject.entity.AuthorTable;
import com.example.BackendProject.entity.LanguageTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookTablePojo {

    int bookId;
    String bookName;
    AuthorTable authorTable;
    LanguageTable languageTable;
    int rating;

}
