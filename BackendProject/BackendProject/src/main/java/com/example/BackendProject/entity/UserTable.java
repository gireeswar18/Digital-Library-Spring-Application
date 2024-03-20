package com.example.BackendProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_table")
@Getter
@Setter

public class UserTable {

    @Column(name = "user_id")
    @Id
    int userId;

    @Column(name = "user_name")
    String userName;

    @OneToOne
    @JoinColumn(name = "user_personal_details_id", referencedColumnName = "personal_detail_id")
    UserPersonalDetail userPersonalDetail;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    BookTable bookTable;

    @Column(name = "from_date")
    String fromDate;

    @Column(name = "to_date")
    String toDate;

    @Column(name = "book_received")
    String bookReceived;

}
