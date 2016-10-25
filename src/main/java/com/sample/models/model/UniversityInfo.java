package com.sample.models.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ganeshramiyer on 10/25/16.
 */

@Entity
@Table(name = "university_department")
public class UniversityInfo {

    @Id
    @Column
    private String id;

    @Column
    private String universityName;

    @Column
    private String departmentInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(String departmentInfo) {
        this.departmentInfo = departmentInfo;
    }

}
