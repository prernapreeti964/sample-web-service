package com.sample.models.facade;


/**
 * Created by ganeshramiyer on 10/23/16.
 */
public interface UserAccountFacade {
    void addTestUser();

    void addUser(String firstname,String lastname,String email,String school,String department,String password);

    boolean checkCredentials(String email, String password);
}
