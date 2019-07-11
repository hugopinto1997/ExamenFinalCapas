package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Cliente;
import com.uca.capas.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository cr;
	
	public List<Cliente> findAll() throws DataAccessException{
		return cr.findAll();
	}
	
	public Cliente findCliente(Integer id) throws DataAccessException{
		return cr.findCliente(id);
	}
}
