package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class RegisterController {

    @Autowired
    UserAccountFacade userAccountFacade;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        userAccountFacade.addTestUser();
        return "hello";
    }
}
