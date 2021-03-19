package com.ojas.ticketservices;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.dao.TicketBookingDao;
import com.ojas.ticket.Ticket;

@org.springframework.stereotype.Service
public class TicketService {
	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingDao.findAll();
	}
	
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}
	
	public Ticket updateTicket(Integer ticketId, String newMail) {
		Ticket ticket = ticketBookingDao.findById(ticketId).orElse(new Ticket());
		ticket.setEmail(newMail);
		return ticketBookingDao.save(ticket);
	}
	
	

}
