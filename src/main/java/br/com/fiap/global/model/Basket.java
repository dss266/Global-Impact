package br.com.fiap.global.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Basket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	@NotBlank
	private String description;
	@NotBlank
	private String price;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Item> items;

	/*
	 * public void addItem(Item item) { this.items.add(item); }
	 */
	
}
