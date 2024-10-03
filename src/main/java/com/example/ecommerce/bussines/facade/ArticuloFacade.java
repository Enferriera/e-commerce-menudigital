package com.example.ecommerce.bussines.facade;

import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.articuloDto.ArticuloDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ArticuloFacade extends BaseFacade<ArticuloDto, Long> {
    List<ArticuloDto> findAllBySucursalId(Long idSucusal);

    Page<ArticuloDto> findAllBySucursalIdPaged(Long idSucursal, Pageable pageable);

    List<ArticuloDto> findAllByCategoriaId(Long idCategoria);

    Page<ArticuloDto> findAllByCategoriaIdPaged(Long idCategoria, Pageable pageable);

    List<ArticuloDto> findAllHabilitadoBySucursalId(Long sucursalId);

    ResponseEntity<List<Map<String, Object>>> getAllImagesByArticuloId(Long id);

}
