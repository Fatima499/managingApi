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
	@JoinColumn(name="featureId", nullable = true)
	@Nullable
	private List<Feature> features = new ArrayList<Feature>();

}
