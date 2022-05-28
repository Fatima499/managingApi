package com.managing.manageProjectApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.managing.manageProjectApi.model.Ticket;

public interface TicketRepository  extends CrudRepository<Ticket,Integer>{

}
