package com.ticketbooking.controller;

import com.ticketbooking.model.Ticket;
import com.ticketbooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping(value = "/tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping(value = "/all") // http://localhost:8080/tickets/all
    public Iterable<Ticket> getAllTickets()
    {
      return ticketService.getAllTickets();
    }
    @PostMapping(value = "/create")
    public Ticket createTicket(@RequestBody Ticket ticketObj)
    {
        return ticketService.createTicket(ticketObj);
    }

    @GetMapping(value = "/{ticketId}")
    public Ticket getTicket(@PathVariable("ticketId") Integer ticketId){
        return ticketService.getByTicketId(ticketId);
    }

    @DeleteMapping(value =  "/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId){
        ticketService.deleteTicket(ticketId);
    }

    @PutMapping( value = "/{ticketId}/{email}")
    public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId ,@PathVariable("email") String email){
        return ticketService.updateTicket(ticketId,email);
    }
}
