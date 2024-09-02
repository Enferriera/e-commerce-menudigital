package com.example.ecommerce.domain.dtos.articuloDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import com.example.ecommerce.domain.dtos.alergeno.AlergenoDto;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaShortDto;
import com.example.ecommerce.domain.entities.ImagenArticulo;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ArticuloDto extends BaseDto {
    protected String denominacion;
    protected Double precioVenta;
    protected String descripcion;
    protected boolean habilitado = true;
    protected String codigo;


    protected Set<ImagenArticulo> imagenes = new HashSet<>();

    protected CategoriaShortDto categoria;

    protected Set<AlergenoDto> alergenos=new HashSet<>();
}
