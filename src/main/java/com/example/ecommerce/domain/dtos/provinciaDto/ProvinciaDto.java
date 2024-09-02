package com.example.ecommerce.domain.dtos.provinciaDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.paisDto.PaisDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProvinciaDto extends BaseDto {
    private String nombre;
    private PaisDto pais;
}
