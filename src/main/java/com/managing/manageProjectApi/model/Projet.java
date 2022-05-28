package com.managing.manageProjectApi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
@Table(name="projet")
public class Projet {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="titre", nullable= false, length=32)
	@NotNull
	private String titre;
	
	@Column(name="description", nullable = true, length =255)
	@Nullable
	private String description;
	
	@Column(name="dateCreation", nullable = false, length = 255)
	@NotNull
	private Date dateCreation;
	
	

}
