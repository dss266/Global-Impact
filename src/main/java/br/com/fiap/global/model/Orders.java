package br.com.fiap.global.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Orders {
	
	@Id
	private int id;
	
	@OneToMany (cascade=CascadeType.PERSIST)
	private List <Basket> baskets;
	
}
