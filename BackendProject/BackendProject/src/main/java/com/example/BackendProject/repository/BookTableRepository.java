package com.example.BackendProject.repository;

import com.example.BackendProject.entity.BookTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookTableRepository extends JpaRepository<BookTable, Integer> {
    List<BookTable> getByLanguageTableLanguageName (String languageName);
    List<BookTable> getByAuthorTableAuthorName (String authorName);
    List<BookTable> getByRating (int rating);
}
