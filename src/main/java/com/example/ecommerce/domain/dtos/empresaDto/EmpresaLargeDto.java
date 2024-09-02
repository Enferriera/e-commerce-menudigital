package com.example.ecommerce.domain.dtos.empresaDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.sucursalDto.SucursalDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpresaLargeDto extends BaseDto {
    private String nombre;
    private String razonSocial;
    private Long cuit;
    private String logo;

    private Set<SucursalDto> sucursales = new HashSet<>();
}
