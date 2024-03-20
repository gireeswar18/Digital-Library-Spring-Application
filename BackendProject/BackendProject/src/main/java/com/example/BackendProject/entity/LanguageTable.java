package com.example.BackendProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "language_table")
@Getter
@Setter

public class LanguageTable {

    @Column(name = "language_id")
    @Id
    int languageId;

    @Column(name = "language_name")
    String languageName;

    @OneToMany(mappedBy = "languageTable")
    List<BookTable> bookTableList;

}
