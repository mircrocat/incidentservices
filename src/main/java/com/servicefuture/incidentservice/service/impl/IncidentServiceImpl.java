package com.servicefuture.incidentservice.service.impl;

import com.servicefuture.incidentservice.exception.NotFoundException;
import com.servicefuture.incidentservice.model.Incident;
import com.servicefuture.incidentservice.repository.IncidentRepository;
import com.servicefuture.incidentservice.service.IncidentService;
import com.servicefuture.incidentservice.utility.ObjectUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
@Service
public class IncidentServiceImpl implements IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    @Override
    public Incident addIncident(Incident incident) {
        return incidentRepository.save(incident);
    }

    @Override
    public Incident updateIncident(Long incidentId, Incident incident) {
        getIncident(incidentId);
        incident.setId(incidentId);
        return incidentRepository.save(incident);
    }

    @Override
    public Incident patchIncident(Long incidentId, Incident incident) {
        Incident existingIncident = getIncident(incidentId);
        ObjectUtility.mergeObject(incident, existingIncident);
        return incidentRepository.save(existingIncident);
    }

    @Override
    public void deleteIncident(Long incidentId) {
        getIncident(incidentId);
        incidentRepository.delete(incidentId);
    }

    @Override
    public Incident getIncident(Long incidentId) {
        Incident incident = incidentRepository.findOne(incidentId);
        if(incident==null) throw new NotFoundException(incidentId.toString());
        return incident;
    }

    @Override
    public Collection<Incident> getIncidents() {
        return incidentRepository.findAll();
    }

}
