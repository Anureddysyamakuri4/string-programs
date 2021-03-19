package com.ojas;

import java.util.Date;

import org.hibernate.service.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ojas.ticket.Ticket;
import com.ojas.ticketservices.TicketService;

@SpringBootApplication
public class WebAppSprings3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSprings3Application.class, args);
	}
	public void run(String...args)throws Exception{
		Ticket ticket = new Ticket();
		ticket.setPassengerName("anu");
		ticket.setEmail("anureddy@143");
		ticket.setSourceStation("delhi");
		ticket.setDestinationStation("hyd");
		ticket.setBookingDate(new Date());
		
	}

}
