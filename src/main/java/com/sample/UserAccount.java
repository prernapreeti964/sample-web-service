package com.sample;

import javax.persistence.*;

/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Entity
@Table(name = "UserAccount")
public class UserAccount {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
