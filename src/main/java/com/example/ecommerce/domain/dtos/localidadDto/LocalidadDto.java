package com.example.ecommerce.domain.dtos.localidadDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.provinciaDto.ProvinciaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LocalidadDto extends BaseDto {
    private String nombre;
    private ProvinciaDto provincia;
}
