package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	@Query(nativeQuery= true,value="select * "
			+"from cliente "
			+ "where c_cliente = ?1")
	public Cliente findCliente(Integer id);
}
