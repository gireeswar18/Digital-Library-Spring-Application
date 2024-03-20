package com.example.BackendProject.domainObjects;

import com.example.BackendProject.entity.BookTable;
import com.example.BackendProject.entity.UserPersonalDetail;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserTablePojo {

    int userId;
    String userName;
    UserPersonalDetail userPersonalDetail;
    BookTable bookTable;
    String fromDate;
    String toDate;
    String bookReceived;

}
