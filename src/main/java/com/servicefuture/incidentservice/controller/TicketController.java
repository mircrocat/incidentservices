package com.servicefuture.incidentservice.controller;

import com.servicefuture.incidentservice.model.Incident;
import com.servicefuture.incidentservice.model.Ticket;
import com.servicefuture.incidentservice.service.IncidentService;
import com.servicefuture.incidentservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
@RestController()
@RequestMapping("/api/incidentservice/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }

    @RequestMapping(value="/{ticketId}", method = RequestMethod.PUT)
    Ticket updateTicket(@PathVariable Long ticketId, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(ticketId, ticket);
    }

    @RequestMapping(value="/{ticketId}", method = RequestMethod.PATCH)
    Ticket patchTicket(@PathVariable Long ticketId, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(ticketId, ticket);
    }

    @RequestMapping(value="/{ticketId}", method = RequestMethod.DELETE)
    void deleteTicket(@PathVariable Long ticketId){
        ticketService.deleteTicket(ticketId);
    }

    @RequestMapping(value="/{ticketId}", method = RequestMethod.GET)
    Ticket getTicket(@PathVariable Long ticketId){
        return ticketService.getTicket(ticketId);
    }

    @RequestMapping(method = RequestMethod.GET)
    Collection<Ticket> getTickets(){
        return ticketService.getTickets();
    }

}
