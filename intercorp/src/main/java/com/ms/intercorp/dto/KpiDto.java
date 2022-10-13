package com.ms.intercorp.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Schema(name = "kpi")
public class KpiDto {

	@Schema(name = "promedioEdad",example = "26.5")
	private Double promedioEdad;
	@Schema(name = "desviacionEstandar",example = "2.5")
	private Double desviacionEstandar;;
}
