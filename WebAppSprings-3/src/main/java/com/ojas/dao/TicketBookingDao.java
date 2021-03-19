package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.ticket.Ticket;

@Repository
public interface TicketBookingDao extends JpaRepository<Ticket,Integer> {
	

}
