package com.example.BackendProject.repository;

import com.example.BackendProject.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTableRepository extends JpaRepository<UserTable, Integer> {
    List<UserTable> getByBookReceived (String bookReceived);
}
