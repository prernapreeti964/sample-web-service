package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class RegisterController {

    @Autowired
    UserAccountFacade userAccountFacade;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String addUser() {
        userAccountFacade.addTestUser();
        return "hello";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String showRegister() {
        return "redirect:register.html";
    }
}
