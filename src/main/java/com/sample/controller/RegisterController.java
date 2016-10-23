package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.model.UserAccount;
import com.sample.model.UserAccountRepository;

/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class RegisterController {

    @Autowired
    private UserAccountRepository userAccountRepo;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        UserAccount user = new UserAccount();
        user.setUserName("First");
        user.setPassword("Test");
        userAccountRepo.save(user);
        return "hello";
    }
}
