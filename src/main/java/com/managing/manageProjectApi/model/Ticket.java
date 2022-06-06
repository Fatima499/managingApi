package com.managing.manageProjectApi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
@Table(name="ticket")
public class Ticket {
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="titre", nullable= false, length=32)
	@NotNull
	private String titre;
	
	@Column(name="descriptif", nullable = true, length =255)
	@Nullable
	private String descriptif;
	
	@Column(name="assignation", nullable = true, length=32)
	@Nullable
	private String assignation;
	
	@Column(name="etat", nullable = true)
	private String etat;
	
	@Column(name="dateCreation", nullable = false)
	@NotNull
	private Date dateCreation;
	
	@Column(name="dateCreation", nullable = false)
	@NotNull
	private Date dateMiseAjour;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true,
			fetch = FetchType.EAGER
			)
	@JoinColumn(name="sousTicketId", nullable = true)
	@Nullable
	private List<SousTicket> sousTaches = new ArrayList<SousTicket>();
	
	
	@OneToMany
	private  List<CommentaireTicket> commentairesTicket = new ArrayList<>();
}
