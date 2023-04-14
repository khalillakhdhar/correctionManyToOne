package com.jpa.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Model {
private String title;
private int nbpage;
@ManyToMany(mappedBy = "books")
private Set<Author> authors=new HashSet<>();

}
