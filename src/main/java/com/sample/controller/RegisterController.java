package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class RegisterController {

    @Autowired
    UserAccountFacade userAccountFacade;

    Logger logger = Logger.getLogger(RegisterController.class);

    @RequestMapping(value = "/registeruser", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("email") String email, @RequestParam("password") String password) {
        logger.info(email +" "+password);
        userAccountFacade.addUser(firstname,lastname,email,"","",password);
        return "User registered";
    }
}
