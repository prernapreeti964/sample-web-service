package com.sample.controller;

import com.sample.models.facade.UserAccountFacade;
import com.sample.models.model.UserAccount;
import com.sample.models.model.UserDetails;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Controller
public class RegisterController {

    @Autowired
    UserAccountFacade userAccountFacade;

    Logger logger = Logger.getLogger(RegisterController.class);

    @RequestMapping(value = "/registeruser", method = RequestMethod.PUT, produces = "plain/text")
    public String addUser(@RequestBody UserDetails userDetails) {
        logger.info("Add user called");
        userAccountFacade.addUser(userDetails);
        return "User registered";
    }
}
