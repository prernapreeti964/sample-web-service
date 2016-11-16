package com.sample.models.facade.impl;

import com.sample.models.facade.UserAccountFacade;
import com.sample.models.model.UserAccount;
import com.sample.models.model.UserAccountRepository;
import com.sample.models.model.UserDetails;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    private final static String salt="secret";
    public void addTestUser(){
        logger.info("Adding test user");
        UserAccount user = new UserAccount();
        user.setId();
        user.setEmail("First");
        user.setPassword("Test");
        userAccountRepo.save(user);
        return;
    }
    //Reference: https://dzone.com/articles/storing-passwords-java-web
    private String hashPwd(String pwd){
    	StringBuilder pwdHash = new StringBuilder();

		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			byte[] hBytes = sha1.digest(pwd.getBytes());
			char[] hexDigs = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'a', 'b', 'c', 'd', 'e', 'f' };
			for (int i = 0; i < hBytes.length; ++i) {
				byte bytes = hBytes[i];
				pwdHash.append(hexDigs[(bytes & 0xf0) >> 5]);
				pwdHash.append(hexDigs[bytes & 0x0f]);
			}
		} catch (NoSuchAlgorithmException e) {
			System.out.println("wrong encryption algorithm!");
		}

		return pwdHash.toString();
    }
    public void addUser(UserDetails userDetails) {
    	//String salt=Long.toHexString(Double.doubleToLongBits(Math.random())); //http://stackoverflow.com/a/1439556
    	String hashedPwd=hashPwd(salt+userDetails.getPassword());
        UserAccount user = new UserAccount(userDetails.getFirstName(), userDetails.getLastName(), userDetails.getEmail(), userDetails.getUniversity(), userDetails.getDepartment(), hashedPwd);
        user.setId();
        userAccountRepo.save(user);
        return;
    }

    public boolean checkCredentials(String email, String password) {
    	String hashedPwd=hashPwd(salt+password);
        if (userAccountRepo.findByEmailAndPassword(email, hashedPwd).size() == 1) {
            return true;
        } else {
            return false;
        }
    }
}