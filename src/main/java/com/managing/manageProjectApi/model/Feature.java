package com.managing.manageProjectApi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

public class Feature {

	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="titre", nullable= false, length=32)
	@NotNull
	private String titre;
	
	@Column(name="descriptif", nullable = true, length =255)
	@Nullable
	private String descriptif;
	
	@Column(name="auteur", nullable = true)
	@Nullable
	private String auteur;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval=true,
			fetch= FetchType.EAGER
			)
	@JoinColumn(name="tacheId", nullable = true)
	@Nullable
	private List<Tache> taches = new ArrayList<Tache>();
}
