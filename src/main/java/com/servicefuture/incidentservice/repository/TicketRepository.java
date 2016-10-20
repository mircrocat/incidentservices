package com.servicefuture.incidentservice.repository;

import com.servicefuture.incidentservice.model.Incident;
import com.servicefuture.incidentservice.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
public interface TicketRepository extends JpaRepository<Ticket, Long>{
    Collection<Incident> findByStatus(String status);
}

