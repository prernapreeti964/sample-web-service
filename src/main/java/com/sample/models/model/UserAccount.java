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
    String firstname;
    @Column(nullable = false)
    String lastname;
    @Column(nullable = false)
    @NotNull
    private String email;
    @Column(nullable = false)
    String school;
    @Column(nullable = false)
    String department;

    @Column(nullable = false)
    private String password;
    public UserAccount(){
    	
    }
    public UserAccount(String firstname,String lastname,String email,String school,String department,String password){
    	this.firstname=firstname;
    	this.lastname=lastname;
    	this.email=email;
    	this.school=school;
    	this.department=department;
    	this.password=password;
    }
    
	public String getEmail() {
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

    
}
