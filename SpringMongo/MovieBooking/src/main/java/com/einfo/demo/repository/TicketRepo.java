package com.einfo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.einfo.demo.model.Ticket;

@Repository
public interface TicketRepo extends MongoRepository<Ticket, String>{

}
