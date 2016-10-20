package com.servicefuture.incidentservice.model;

import javax.persistence.*;

/**
 * Created by zhenjian on 2016/10/20.
 */
@Entity
public class Ticket extends BaseEntity{

    private String description;

    private String status;

    private String submitter;

    private String assignee;

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

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
}
