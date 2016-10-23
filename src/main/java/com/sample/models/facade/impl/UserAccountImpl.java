package com.sample.models.facade.impl;

import com.sample.controller.RegisterController;
import com.sample.models.facade.UserAccountFacade;
import com.sample.models.model.UserAccount;
import com.sample.models.model.UserAccountRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ganeshramiyer on 10/23/16.
 */
@Service
public class UserAccountImpl implements UserAccountFacade{

    private static final Logger logger = Logger.getLogger(UserAccountFacade.class);

    @Autowired
    private UserAccountRepository userAccountRepo;

    public void addTestUser(){
        logger.info("Adding test user");
        UserAccount user = new UserAccount();
        user.setId();
        user.setUserName("First");
        user.setPassword("Test");
        userAccountRepo.save(user);
        return;
    }


}
