package com.servicefuture.incidentservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by zhenjian on 2016/9/20.
 */

@Entity
public class Incident {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private String status;

    private String customer;

    private String project;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
