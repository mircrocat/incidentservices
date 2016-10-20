package com.servicefuture.incidentservice.service;

import com.servicefuture.incidentservice.model.Incident;
import com.servicefuture.incidentservice.model.Ticket;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
public interface TicketService {
    Ticket addTicket(Ticket ticket);
    Ticket updateTicket(Long ticketId, Ticket ticket);
    Ticket patchTicket(Long incidentId, Ticket ticket);
    void deleteTicket(Long ticketId);
    Ticket getTicket(Long ticketId);
    Collection<Ticket> getTickets();
}
