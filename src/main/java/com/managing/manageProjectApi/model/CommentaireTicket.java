package com.managing.manageProjectApi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="commentaireTicket")
@Data
public class CommentaireTicket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval =true,
			fetch= FetchType.EAGER
			)
	@JoinColumn(name="ticketId", nullable= true)
	private List<Ticket> ticketId = new ArrayList<>();
	
	@Column(name="commentaire", nullable = true, length =255)
	private String commentaire;
}
