package com.ms.intercorp.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ms.intercorp.model.Cliente;
import com.ms.intercorp.repository.ClienteRepository;
import com.ms.intercorp.repository.crud.ClienteCrud;

@Repository
@Transactional
public class ClienteRepositoryImpl implements ClienteRepository{

	@Autowired
	private ClienteCrud clienteCrud;

	@Override
	public Cliente createCliente(Cliente cliente) {
		cliente = clienteCrud.save(cliente);
		return cliente;
	}

	@Override
	public List<Cliente> kpiClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAllClientes() {		
		return clienteCrud.findAll();
	}
	
}
