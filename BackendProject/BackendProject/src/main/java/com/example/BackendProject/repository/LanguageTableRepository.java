package com.example.BackendProject.repository;

import com.example.BackendProject.entity.LanguageTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageTableRepository extends JpaRepository<LanguageTable, Integer> {

}
