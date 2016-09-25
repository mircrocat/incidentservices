package com.servicefuture.incidentservice.service.impl;

import com.servicefuture.incidentservice.exception.NotFoundException;
import com.servicefuture.incidentservice.model.Incident;
import com.servicefuture.incidentservice.repository.IncidentRepository;
import com.servicefuture.incidentservice.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
    public Long addIncident(Incident incident) {
        return incidentRepository.save(incident).getId();
    }

    @Override
    public void updateIncident(Long incidentId, Incident incident) {
        validateExistingIncident(incidentId);
        incident.setId(incidentId);
        incidentRepository.save(incident);
    }

    @Override
    public void deleteIncident(Long incidentId) {
        validateExistingIncident(incidentId);
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

    private void validateExistingIncident(Long incidentId){
        Incident existingIncident = incidentRepository.findOne(incidentId);
        if(existingIncident == null) throw new NotFoundException(incidentId.toString());
    }
}
