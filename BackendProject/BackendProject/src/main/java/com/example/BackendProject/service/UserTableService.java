package com.example.BackendProject.service;

import com.example.BackendProject.domainObjects.UserTablePojo;
import com.example.BackendProject.entity.BookTable;
import com.example.BackendProject.entity.UserPersonalDetail;
import com.example.BackendProject.entity.UserTable;
import com.example.BackendProject.repository.UserTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTableService {

    @Autowired
    UserTableRepository userTableRepository;

    public void getUserTable ()
    {
        List<UserTable> userTableList = userTableRepository.findAll();
        System.out.println("Users Are: ");
        for (UserTable user : userTableList)
        {
            System.out.println("User Id: " + user.getUserId());
            System.out.println("User Name: " + user.getUserName());
            System.out.println("User Personal Detail Id: " + user.getUserPersonalDetail().getPersonalDetailId());
            System.out.println("User Phone Number: " + user.getUserPersonalDetail().getPhoneNumber());
            System.out.println("User Address: " + user.getUserPersonalDetail().getAddress());
            System.out.println("User Book Rented: " + user.getBookTable().getBookName());
            System.out.println("User From Date: " + user.getFromDate());
            System.out.println("User To Date: " + user.getToDate());
            System.out.println("User Book Returned: " + user.getBookReceived());
            System.out.println("-------------------------------------------------");
        }
    }

    public void createUser (UserTablePojo userTablePojo)
    {
        UserTable user = new UserTable();
        user.setUserId(userTablePojo.getUserId());
        user.setUserName(userTablePojo.getUserName());
        UserPersonalDetail userPersonalDetail = new UserPersonalDetail();
        userPersonalDetail.setPersonalDetailId(userTablePojo.getUserPersonalDetail().getPersonalDetailId());
        userPersonalDetail.setPhoneNumber(userTablePojo.getUserPersonalDetail().getPhoneNumber());
        userPersonalDetail.setAddress(userTablePojo.getUserPersonalDetail().getAddress());
        user.setUserPersonalDetail(userPersonalDetail);
        BookTable book = new BookTable();
        book.setBookId(userTablePojo.getBookTable().getBookId());
        book.setBookName(userTablePojo.getBookTable().getBookName());
        user.setBookTable(book);
        user.setFromDate(userTablePojo.getFromDate());
        user.setToDate(userTablePojo.getToDate());
        user.setBookReceived(userTablePojo.getBookReceived());
        userTableRepository.save(user);
        System.out.println("User Saved Successfully...");
    }

    public void updateUser (UserTablePojo userTablePojo)
    {
        UserTable user = userTableRepository.getReferenceById(userTablePojo.getUserId());
        user.setUserName(userTablePojo.getUserName());
        UserPersonalDetail userPersonalDetail = new UserPersonalDetail();
        userPersonalDetail.setPersonalDetailId(userTablePojo.getUserPersonalDetail().getPersonalDetailId());
        userPersonalDetail.setPhoneNumber(userTablePojo.getUserPersonalDetail().getPhoneNumber());
        userPersonalDetail.setAddress(userTablePojo.getUserPersonalDetail().getAddress());
        user.setUserPersonalDetail(userPersonalDetail);
        BookTable book = new BookTable();
        book.setBookId(userTablePojo.getBookTable().getBookId());
        book.setBookName(userTablePojo.getBookTable().getBookName());
        user.setBookTable(book);
        user.setFromDate(userTablePojo.getFromDate());
        user.setToDate(userTablePojo.getToDate());
        user.setBookReceived(userTablePojo.getBookReceived());
        userTableRepository.save(user);
        System.out.println("User Updated Successfully...");
    }

    public void getUsersWhoCrossedDate (String bookReceived)
    {
        List<UserTable> userTableList = userTableRepository.getByBookReceived(bookReceived);
        System.out.println("Users who haven't returned their book: ");
        for (UserTable user : userTableList)
        {
            System.out.println("User Name: " + user.getUserName());
            System.out.println("User Name: " + user.getUserPersonalDetail().getPhoneNumber());
            System.out.println("--------------------------------------");
        }
    }

}
