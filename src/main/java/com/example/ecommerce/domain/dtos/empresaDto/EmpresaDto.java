package com.example.ecommerce.domain.dtos.empresaDto;

import com.example.ecommerce.domain.dtos.BaseDto;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmpresaDto extends BaseDto {
    private String nombre;
    private String razonSocial;
    private Long cuit;
    private String logo;

}
