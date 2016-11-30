package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ganeshramiyer on 10/24/16.
 */
@Controller
public class LoginController {

    Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    UserAccountFacade userAccountFacade;

    @RequestMapping(value = "/validateuser", method = RequestMethod.GET)
    @ResponseBody
    public String validateUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (userAccountFacade.checkCredentials(username, password)) {
            logger.info("True");
            return "Valid user";
        } else {
            return "Wrong credentials";
        }
    }
}
