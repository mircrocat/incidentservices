package com.servicefuture.incidentservice.controller;

import com.servicefuture.incidentservice.model.Incident;
import com.servicefuture.incidentservice.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
@RestController()
@RequestMapping("/api/incidentservice/incidents")
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Incident addIncident(@RequestBody Incident incident){
        return incidentService.addIncident(incident);
    }

    @RequestMapping(value="/{incidentId}", method = RequestMethod.PUT)
    void updateIncident(@PathVariable Long incidentId, @RequestBody Incident incident) {
        incidentService.updateIncident(incidentId, incident);
    }

    @RequestMapping(value="/{incidentId}", method = RequestMethod.PATCH)
    void patchIncident(@PathVariable Long incidentId, @RequestBody Incident incident) {
        incidentService.updateIncident(incidentId, incident);
    }

    @RequestMapping(value="/{incidentId}", method = RequestMethod.DELETE)
    void updateIncident(@PathVariable Long incidentId){
        incidentService.deleteIncident(incidentId);
    }

    @RequestMapping(value="/{incidentId}", method = RequestMethod.GET)
    Incident getIncident(@PathVariable Long incidentId){
        return incidentService.getIncident(incidentId);
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<Incident> getIncidents(){
        return incidentService.getIncidents();
    }



}
