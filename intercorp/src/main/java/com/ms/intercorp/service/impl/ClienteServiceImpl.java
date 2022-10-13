package com.ms.intercorp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.intercorp.dto.ClienteDto;
import com.ms.intercorp.dto.KpiDto;
import com.ms.intercorp.model.Cliente;
import com.ms.intercorp.repository.ClienteRepository;
import com.ms.intercorp.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public ClienteDto createCliente(ClienteDto clienteDto) {
		Cliente cliente = new Cliente();
		try {
			if (clienteDto!=null) {
				cliente.setNombre(clienteDto.getNombre());
				cliente.setApellido(clienteDto.getApellido());
				cliente.setEdad(clienteDto.getEdad());
				cliente.setFechaNacimiento(clienteDto.getFechaNacimiento());
				cliente = clienteRepository.createCliente(cliente);
				if(cliente.getId()!=null) {
					clienteDto.setId(cliente.getId());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return clienteDto;
	}

	@Override
	public KpiDto kpiClientes() {
		KpiDto kpi = new KpiDto();
		try {
			List<Cliente> listClientes = clienteRepository.getAllClientes();
			if (listClientes != null && listClientes.size()>0) {
				double sumaEdades = 0.0;
				for (Cliente cliente : listClientes) {
					sumaEdades += cliente.getEdad().doubleValue();
				}
				//Cáluclo del promedio
				double promedioEdad = sumaEdades / listClientes.size();
				kpi.setPromedioEdad(promedioEdad);
				
				//Cáluclo de la Desviación Estandar
				double sumaDesviacionStandar = 0.0;
				for (Cliente cliente : listClientes) {
					sumaDesviacionStandar += Math.pow((cliente.getEdad() - promedioEdad),2); 
				}
				kpi.setDesviacionEstandar(sumaDesviacionStandar  / listClientes.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kpi;
	}

	@Override
	public List<ClienteDto> getAllClientes() {
		List<ClienteDto> listClienteDto = new ArrayList<ClienteDto>();
		try {
			List<Cliente> listCliente = clienteRepository.getAllClientes();
			for (Cliente cliente : listCliente) {
				ClienteDto clienteDto = new ClienteDto();
				clienteDto.setId(cliente.getId());
				clienteDto.setNombre(cliente.getNombre());
				clienteDto.setApellido(cliente.getApellido());
				clienteDto.setEdad(cliente.getEdad());
				clienteDto.setFechaNacimiento(cliente.getFechaNacimiento());
				listClienteDto.add(clienteDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listClienteDto;
	}

}
