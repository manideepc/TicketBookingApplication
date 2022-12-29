package com.ticketbooking.service;

import com.ticketbooking.dao.TicketDao;
import com.ticketbooking.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // Business logic is taken care.
public class TicketService {

    @Autowired
    private TicketDao ticketDao;

    //GetAllTickets
    public Iterable<Ticket> getAllTickets(){
        return ticketDao.findAll();
        // select * from tbl_ticket
    }

    // Create Ticket
    public Ticket createTicket(Ticket ticket){
        return ticketDao.save(ticket);
        /*
        save--> Insert the data --> insert into tbl_ticket values(...);
        Save method will perform insert and update also.
         */
    }

    // Getting Particular ticket
    public Ticket getByTicketId(Integer ticketId){
        return ticketDao.findById(ticketId).orElse(new Ticket());
    }

    // Delete Ticket
    public void deleteTicket(Integer ticketId){
        ticketDao.deleteById(ticketId);
    }

    // Update the Ticket
    public Ticket updateTicket(Integer ticketId , String email){
        Ticket dbTicket = getByTicketId(ticketId);
        dbTicket.setEmail(email);
        return ticketDao.save(dbTicket);

    }
}
