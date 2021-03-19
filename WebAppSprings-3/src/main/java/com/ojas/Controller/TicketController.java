package com.ojas.Controller;

import javax.xml.crypto.dsig.TransformService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.ticket.Ticket;
import com.ojas.ticketservices.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
	@Autowired
	private TicketService service;

	@GetMapping("/getAllTickets")
	public Iterable<Ticket> getAllTickets() {
		return service.getAllTickets();
	}

	@PostMapping("/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return service.createTicket(ticket);
	}

	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId")Integer ticketId) {
		
}

@PutMapping("/ticket/{ticket}/{newEmail}")
public Ticket UpdateTicket(@PathVariable("ticketId")Integer ticketId,@PathVariable("newEmail")String newEmail) {
	return service.updateTicket(ticketId, newEmail);
}
}
