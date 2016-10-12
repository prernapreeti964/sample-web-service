package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class RegisterController {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @RequestMapping("/")
    public String test() {
        UserAccount user = new UserAccount();
        user.setUserName("First");
        user.setPassword("Test");
        userAccountRepository.save(user);
        return "hello";
    }
}
