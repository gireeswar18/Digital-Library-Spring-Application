package com.example.BackendProject.service;

import com.example.BackendProject.domainObjects.UserPersonalDetailPojo;
import com.example.BackendProject.entity.UserPersonalDetail;
import com.example.BackendProject.repository.UserPersonalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPersonalDetailService {

    @Autowired
    UserPersonalDetailRepository userPersonalDetailRepository;

    public void getUserPersonalDetail ()
    {
        List<UserPersonalDetail> userPersonalDetailList = userPersonalDetailRepository.findAll();
        System.out.println("User Personal Details Are: ");
        for (UserPersonalDetail user : userPersonalDetailList)
        {
            System.out.println("User Name: " + user.getUserTable().getUserName());
            System.out.println("User Id: " + user.getPersonalDetailId());
            System.out.println("User Phone Number: " + user.getPhoneNumber());
            System.out.println("User Address: " + user.getAddress());
            System.out.println("--------------------------------");
        }
    }

    public void createUserPersonalDetail (UserPersonalDetailPojo userPersonalDetailPojo)
    {
        UserPersonalDetail userPersonalDetail = new UserPersonalDetail();
        userPersonalDetail.setPersonalDetailId(userPersonalDetailPojo.getPersonalDetailId());
        userPersonalDetail.setPhoneNumber(userPersonalDetailPojo.getPhoneNumber());
        userPersonalDetail.setAddress(userPersonalDetailPojo.getAddress());
        userPersonalDetailRepository.save(userPersonalDetail);
        System.out.println("User Personal Details Saved Successfully...");
    }

    public void updateUserPersonalDetail (UserPersonalDetailPojo userPersonalDetailPojo)
    {
        UserPersonalDetail userPersonalDetail = userPersonalDetailRepository.getReferenceById(userPersonalDetailPojo.getPersonalDetailId());
        userPersonalDetail.setPhoneNumber(userPersonalDetailPojo.getPhoneNumber());
        userPersonalDetail.setAddress(userPersonalDetailPojo.getAddress());
        userPersonalDetailRepository.save(userPersonalDetail);
        System.out.println("User Personal Details Updated Successfully...");
    }
}
