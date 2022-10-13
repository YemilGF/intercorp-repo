package com.ms.intercorp.dto;

import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Schema(name = "cliente")
public class ClienteDto{
	
	private Integer id;
	@Schema(name = "nombre",example = "Yemil",required = true)
	private String nombre;
	@Schema(name = "apellido",example = "Goicochea",required = true)
	private String apellido;
	@Schema(name = "edad",example = "22",required = true)
	private Integer edad;
	@Schema(name = "fechaNacimiento",example = "2000-08-11",required = true)
	private Date fechaNacimiento;
}
