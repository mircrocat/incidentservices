package com.servicefuture.incidentservice.service.impl;

import com.servicefuture.incidentservice.exception.NotFoundException;
import com.servicefuture.incidentservice.model.Ticket;
import com.servicefuture.incidentservice.repository.TicketRepository;
import com.servicefuture.incidentservice.service.TicketService;
import com.servicefuture.incidentservice.utility.ObjectUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Long ticketId, Ticket ticket) {
        getTicket(ticketId);
        ticket.setId(ticketId);
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket patchTicket(Long ticketId, Ticket ticket) {
        Ticket existingTicket = getTicket(ticketId);
        ObjectUtility.mergeObject(ticket,existingTicket);
        return ticketRepository.save(existingTicket);
    }

    @Override
    public void deleteTicket(Long ticketId) {
        ticketRepository.delete(ticketId);
    }

    @Override
    public Ticket getTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findOne(ticketId);
        if(ticket==null) throw new NotFoundException(ticket.toString());
        return ticket;
    }

    @Override
    public Collection<Ticket> getTickets() {
        return ticketRepository.findAll();
    }
}
