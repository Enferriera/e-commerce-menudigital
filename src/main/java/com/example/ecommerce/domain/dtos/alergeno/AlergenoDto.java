package com.example.ecommerce.domain.dtos.alergeno;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.ImagenDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AlergenoDto extends BaseDto {
    private String denominacion;
    private ImagenDto imagen;
}
