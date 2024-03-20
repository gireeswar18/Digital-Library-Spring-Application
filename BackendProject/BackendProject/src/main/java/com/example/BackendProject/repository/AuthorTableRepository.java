package com.example.BackendProject.repository;

import com.example.BackendProject.entity.AuthorTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorTableRepository extends JpaRepository<AuthorTable, Integer> {

}
