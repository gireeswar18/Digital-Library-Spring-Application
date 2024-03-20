package com.example.BackendProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_personal_detail")
@Getter
@Setter

public class UserPersonalDetail {

    @Column(name = "personal_detail_id")
    @Id
    int personalDetailId;

    @Column(name = "phone_number")
    long phoneNumber;

    @Column(name = "address")
    String address;

    @OneToOne(mappedBy = "userPersonalDetail")
    UserTable userTable;
}
