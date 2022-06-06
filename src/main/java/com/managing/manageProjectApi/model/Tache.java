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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.Data;

@Entity
@Table(name="tache")
@Data
public class Tache {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="titre", nullable = false, length = 32)
	@NotNull
	private String titre;
	
	@Column(name="descriptif", nullable = false, length = 255)
	@NotNull
	private String descriptif;
	
	@Column(name="descriptif", nullable = true, length=32)
	@Nullable
	private String assignation;
	
	@Column(name="dateCreation", nullable = false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dateCreation;
	
	@Column(name="dateCloture", nullable = true)
	@Temporal(TemporalType.DATE)
	@Nullable
	private Date dateCloture;
	
	@Column(name="etat", nullable= false, length=32)
	@NotNull
	private String etat;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true,
			fetch = FetchType.EAGER
			)
	@JoinColumn(name ="ticketId", nullable = true)
	@Nullable
	private List<Ticket> ticketId = new ArrayList<>();	

}
