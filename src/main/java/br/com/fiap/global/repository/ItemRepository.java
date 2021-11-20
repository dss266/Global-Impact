package br.com.fiap.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.global.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
