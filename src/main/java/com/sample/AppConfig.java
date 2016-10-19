package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by ganeshramiyer on 10/19/16.
 */
@Configuration
public class AppConfig {

    @Bean
    public EntityManager entityManager() {
        return Persistence.createEntityManagerFactory("userAccount").createEntityManager();
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        return Persistence.createEntityManagerFactory("userAccount");
    }
}
