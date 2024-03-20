package com.example.BackendProject.controller;

import com.example.BackendProject.domainObjects.UserPersonalDetailPojo;
import com.example.BackendProject.service.UserPersonalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPersonalDetailController {

    @Autowired
    UserPersonalDetailService userPersonalDetailService;

    @GetMapping(path = "/getUserPersonalDetail")
    public void getUserPersonalDetail ()
    {
        userPersonalDetailService.getUserPersonalDetail();
    }

    @PostMapping(path = "/createUserPersonalDetail")
    public void createUserPersonalDetail (@RequestBody UserPersonalDetailPojo userPersonalDetailPojo)
    {
        userPersonalDetailService.createUserPersonalDetail(userPersonalDetailPojo);
    }

    @PostMapping(path = "/updateUserPersonalDetail")
    public void updateUserPersonalDetail (@RequestBody UserPersonalDetailPojo userPersonalDetailPojo)
    {
        userPersonalDetailService.updateUserPersonalDetail(userPersonalDetailPojo);
    }
}
