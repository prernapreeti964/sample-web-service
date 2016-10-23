package com.sample.controller;

import org.apache.log4j.Logger;
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

    private static final Logger logger = Logger.getLogger(RegisterController.class);

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        logger.info("Adding test user");
        UserAccount user = new UserAccount();
        user.setId();
        user.setUserName("First");
        user.setPassword("Test");
        userAccountRepo.save(user);
        return "hello";
    }
}
