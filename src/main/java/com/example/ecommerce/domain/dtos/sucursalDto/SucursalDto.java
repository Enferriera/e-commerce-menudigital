package com.example.ecommerce.domain.dtos.sucursalDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaShortDto;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioDto;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SucursalDto extends BaseDto {
    private String nombre;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss")
    private LocalTime horarioApertura;
    @Schema(type = "string", format = "time", pattern = "HH:mm:ss")
    private LocalTime horarioCierre;
    private boolean esCasaMatriz;
    private double latitud;
    private double longitud;
    private String logo;

    private DomicilioDto domicilio;

    private EmpresaDto empresa;

    private Set<CategoriaShortDto> categorias = new HashSet<>();
}
