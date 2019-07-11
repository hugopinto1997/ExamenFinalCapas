package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Producto;
import com.uca.capas.repositories.ProductoRepository;


@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	ProductoRepository pr;
	
	public List<Producto> findAll() throws DataAccessException{
		return pr.findAll();
	}
	
	public Producto findOne(Integer id) throws DataAccessException{
		return pr.findPorId(id);
	}
}
