package com.sample.models.facade;


import com.sample.models.model.UserDetails;

/**
 * Created by ganeshramiyer on 10/23/16.
 */
public interface UserAccountFacade {
    void addTestUser();

    void addUser(UserDetails userDetails);

    boolean checkCredentials(String email, String password);
}
