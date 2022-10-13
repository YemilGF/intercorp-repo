package com.ms.intercorp.service;

import java.util.List;

import com.ms.intercorp.dto.ClienteDto;
import com.ms.intercorp.dto.KpiDto;

public interface ClienteService {
	
	/**
	 * @param ClienteDto
	 * @return ClienteDto
	 */
	public ClienteDto createCliente(ClienteDto clienteDto);
	
	/**
	 * 
	 * @return KpiDto
	 */
	public KpiDto kpiClientes();
	
	/**
	 * 
	 * @return List<ClienteDto>
	 */
	public List<ClienteDto> getAllClientes();

}
