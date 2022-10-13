package com.ms.intercorp.repository;

import java.util.List;

import com.ms.intercorp.model.Cliente;

public interface ClienteRepository {

	/**
	 * @param Cliente
	 * @return Cliente
	 */
	public Cliente createCliente(Cliente cliente);
	
	/**
	 * 
	 * @return
	 */
	public List<Cliente> kpiClientes();
	
	/**
	 * 
	 * @return List<Cliente>
	 */
	public List<Cliente> getAllClientes();
}
