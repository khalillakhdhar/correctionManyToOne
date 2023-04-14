package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Produit extends Model {

	@Column(nullable = false)
	private String titre , photo, description;
	@Min(value = 1)
	private float prix;
	
	@ManyToOne()
	@JoinColumn(name="categorie")
	private Categorie categorie;
	
	
}
