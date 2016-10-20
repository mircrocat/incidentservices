package com.servicefuture.incidentservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by zhenjian on 2016/10/20.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotNull
    private String company;



    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
