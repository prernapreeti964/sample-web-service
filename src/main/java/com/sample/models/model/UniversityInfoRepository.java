package com.sample.models.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ganeshramiyer on 10/25/16.
 */
public interface UniversityInfoRepository extends CrudRepository<UniversityInfo, Long> {
    List<UniversityInfo> findAll();

    List<UniversityInfo> findByUniversityName(String universityName);
}
