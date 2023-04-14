package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adresse extends Model {
private String street,city;

@OneToOne()
@JoinColumn(name = "person_id")
private Person personne;
}
