package com.example.BackendProject.repository;

import com.example.BackendProject.entity.UserPersonalDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersonalDetailRepository extends JpaRepository<UserPersonalDetail, Integer> {

}
