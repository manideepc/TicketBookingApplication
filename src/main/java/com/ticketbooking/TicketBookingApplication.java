package com.ticketbooking;

import com.ticketbooking.model.Ticket;
import com.ticketbooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {

	@Autowired
	TicketService ticketService;
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ticket ticketObj = new Ticket();
		ticketObj.setPassengerName("Abijeet");
		ticketObj.setSourceStation("Karimnagar");
		ticketObj.setDestinationStation("Hyderabad");
		ticketObj.setTravelDate(new Date());
		ticketObj.setEmail("qwerty@gmail.com");
		ticketService.createTicket(ticketObj);

	}
}
