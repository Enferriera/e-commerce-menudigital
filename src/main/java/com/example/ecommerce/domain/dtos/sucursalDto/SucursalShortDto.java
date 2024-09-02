package com.example.ecommerce.domain.dtos.sucursalDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SucursalShortDto extends BaseDto {
    private String nombre;

}
