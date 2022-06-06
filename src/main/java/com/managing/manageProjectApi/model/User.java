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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nom", nullable=false, length =32)
	@Nullable
	private String nom;
	
	@Column(name="prenom", nullable=false, length =32)
	@Nullable
	private String prenom;
	
	@Column(name="speudo", nullable=false, length =32)
	@Nullable
	private String speudo;
	
	@ManyToMany(
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			},
			
			fetch = FetchType.LAZY
			)
	@JoinTable(name="user_role",
			joinColumns=@JoinColumn(name="userId", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="roleId", referencedColumnName="id")
			)
	private List<Role> roles = new ArrayList<>();
}
