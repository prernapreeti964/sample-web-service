package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ganeshramiyer on 10/24/16.
 */
@Controller
public class LoginController {

    @Autowired
    UserAccountFacade userAccountFacade;

    @RequestMapping(value = "/validateuser", method = RequestMethod.POST)
    @ResponseBody
    public String validateUser(@RequestParam("email") String email, @RequestParam("password") String password){
        if (userAccountFacade.checkCredentials(email, password)) {
            return "Valid user";
        } else {
            return "Wrong credentials";
        }
    }
}
