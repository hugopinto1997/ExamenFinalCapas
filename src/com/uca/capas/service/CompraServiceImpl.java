package com.uca.capas.service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Compra;
import com.uca.capas.dto.CompraDTO;
import com.uca.capas.repositories.ClienteRepository;
import com.uca.capas.repositories.CompraRepository;
import com.uca.capas.repositories.ProductoRepository;

@Service
public class CompraServiceImpl implements CompraService {
	
	@Autowired
	CompraRepository cr;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ProductoRepository pr;
	
	public List<Compra> findAll() throws DataAccessException{
		return cr.findAll();
	}
	
	public List<Compra> findComprasXCliente(Integer id) throws DataAccessException{
		return cr.findByCliente(id);
	}
	
	@Transactional
	public void insertar(CompraDTO c) throws DataAccessException{
		Compra c1 = new Compra();
		Calendar cal = Calendar.getInstance();
		c1.setcCliente(clienteRepository.findCliente(c.getcCliente()));
		c1.setcProducto(pr.findPorId(c.getcProducto()));
		c1.setfCompra(new java.sql.Date(cal.getTimeInMillis()));
		c1.setnTotal(c.getnTotal());
		c1.setnCantidad(c.getnCantidad());
		cr.saveAndFlush(c1);
	}
}
