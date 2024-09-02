package com.example.ecommerce.domain.dtos.articuloDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.ImagenDto;
import com.example.ecommerce.domain.dtos.alergeno.AlergenoDto;

import lombok.*;


import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ArticuloShortDto extends BaseDto {
    protected String denominacion;
    protected Double precioVenta;
    protected String descripcion;
    protected boolean habilitado;
    protected String codigo;


    protected Set<ImagenDto> imagenes = new HashSet<>();

    protected Set<AlergenoDto> alergenos=new HashSet<>();
}
