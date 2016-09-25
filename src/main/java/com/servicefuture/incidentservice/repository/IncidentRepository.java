package com.servicefuture.incidentservice.repository;

import com.servicefuture.incidentservice.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by zhenjian on 2016/9/20.
 */
public interface IncidentRepository extends JpaRepository<Incident, Long>{
    Collection<Incident> findByCustomer(String customer);
}

