package com.sample.models.facade;


/**
 * Created by ganeshramiyer on 10/23/16.
 */
public interface UserAccountFacade {
    void addTestUser();

    void addUser(String email, String password);

    boolean checkCredentials(String email, String password);
}
