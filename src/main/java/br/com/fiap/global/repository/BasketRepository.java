package br.com.fiap.global.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.global.model.Basket;

public interface BasketRepository extends JpaRepository<Basket, Long>{
	
	Optional<Basket> findById(Long id);

}
