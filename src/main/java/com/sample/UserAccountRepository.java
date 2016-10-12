package com.sample;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ganeshramiyer on 10/12/16.
 */

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
