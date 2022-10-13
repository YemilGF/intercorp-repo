package com.ms.intercorp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ms.intercorp.dto.ClienteDto;
import com.ms.intercorp.dto.KpiDto;
import com.ms.intercorp.service.ClienteService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/crear")
	@ResponseStatus(value = HttpStatus.CREATED)
	@ApiResponse(description = "Crear el cliente")
	public ResponseEntity<ClienteDto> createCliente(@RequestBody ClienteDto clienteDto) {
		clienteDto = clienteService.createCliente(clienteDto);
		return ResponseEntity.ok(clienteDto);
		
	}
	
	@GetMapping("/kpi")
	@ApiResponse(description = "Obtener el kpi")
	public ResponseEntity<KpiDto> kpiClientes() {
		KpiDto kpi = new KpiDto();
		kpi = clienteService.kpiClientes();
		return ResponseEntity.ok(kpi);
		
	}
	
	@GetMapping("/list")
	@ResponseStatus(value = HttpStatus.OK)
	@ApiResponse(description = "Listar los clientes")
	public ResponseEntity<List<ClienteDto>> listar() {
		List<ClienteDto> listClientes = clienteService.getAllClientes();
		return ResponseEntity.ok(listClientes);
	}

}
