package com.ticketbooking.dao;

import com.ticketbooking.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // It'll automatically create a DB connection.
public interface TicketDao extends CrudRepository<Ticket,Integer> {
}
