package com.sample.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * Created by ganeshramiyer on 10/12/16.
 */

@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccount {
    @Id
    private String id;

    @Column(nullable = false)
    @NotNull
    private String userName;

    @Column(nullable = false)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
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
