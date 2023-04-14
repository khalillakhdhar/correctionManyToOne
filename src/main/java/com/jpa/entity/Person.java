package com.jpa.entity;

import org.springframework.core.annotation.MergedAnnotation.Adapt;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person extends Model {
	
	private String name;
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "personne")
	private Adresse adresse;

}
