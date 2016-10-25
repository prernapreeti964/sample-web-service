package com.sample.models.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ganeshramiyer on 10/12/16.
 */

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
    List<UserAccount> findByEmailAndPassword(String email, String password);
}
