package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Cliente;
import com.uca.capas.domain.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
	@Query(nativeQuery= true,value="select * "
			+"from compra "
			+ "where c_cliente = ?1")
	public List<Compra> findByCliente(Integer id);
}
