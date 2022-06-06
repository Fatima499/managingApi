package com.managing.manageProjectApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
@Table(name="sousTicket")
public class SousTicket {
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
	
	
}
