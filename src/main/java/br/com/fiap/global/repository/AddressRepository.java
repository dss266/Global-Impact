package br.com.fiap.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.global.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}