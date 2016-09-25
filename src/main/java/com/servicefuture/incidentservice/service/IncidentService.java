package com.servicefuture.incidentservice.service;

import com.servicefuture.incidentservice.model.Incident;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
public interface IncidentService {
    Long addIncident(Incident incident);
    void updateIncident(Long incidentId, Incident incident);
    void deleteIncident(Long incidentId);
    Incident getIncident(Long incidentId);
    Collection<Incident> getIncidents();
}
