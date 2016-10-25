package com.sample.models.model;

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
    private String email;

    @Column(nullable = false)
    private String password;

    public String getUserName() {
        return email;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
