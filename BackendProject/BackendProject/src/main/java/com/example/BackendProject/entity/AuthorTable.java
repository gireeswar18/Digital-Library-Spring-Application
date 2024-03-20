package com.example.BackendProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "author_table")
@Getter
@Setter

public class AuthorTable {

    @Column(name = "author_id")
    @Id
    int authorId;

    @Column(name = "author_name")
    String authorName;

    @OneToMany(mappedBy = "authorTable")
    List<BookTable> bookTableList;
}
