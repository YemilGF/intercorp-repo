package com.ms.intercorp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Table(name = "Cliente")
@Entity
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Integer id;
	@Schema(name = "nombre",example = "Yemil")
	@Column(name = "NOMBRE")
	private String nombre;
	@Schema(name = "apellido",example = "Goicochea")
	@Column(name = "APELLIDO")
	private String apellido;
	@Schema(name = "edad",example = "22")
	@Column(name = "EDAD")
	private Integer edad;
	@Schema(name = "fechaNacimiento",example = "2000-08-11")
	@Column(name = "FECHANACIMIENTO")
	private Date fechaNacimiento;

}
