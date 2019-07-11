package com.uca.capas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Compra;
import com.uca.capas.domain.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	@Query(nativeQuery= true,value="select * "
			+"from producto "
			+ "where c_producto = ?1")
	public Producto findPorId(Integer id);
}
