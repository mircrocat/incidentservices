package com.servicefuture.incidentservice.model;

import javax.persistence.*;

/**
 * Created by zhenjian on 2016/9/20.
 */

@Entity
public class Incident extends BaseEntity {

    private String title;

    private String description;

    private String status;

    private String device;

    private String submitter;

    private String assignee;

    private Long ticketId;


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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
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

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicket(Long ticketId) {
        this.ticketId = ticketId;
    }
}
