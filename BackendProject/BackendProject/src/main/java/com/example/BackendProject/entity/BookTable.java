package com.example.BackendProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "book_table")
@Getter
@Setter

public class BookTable {

    @Column(name = "book_id")
    @Id
    int bookId;

    @Column(name = "book_name")
    String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    AuthorTable authorTable;

    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "language_id")
    LanguageTable languageTable;

    @Column(name = "rating")
    int rating;

    @OneToMany(mappedBy = "bookTable")
    List<UserTable> userTableList;

}
