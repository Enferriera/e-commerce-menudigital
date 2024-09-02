package com.example.ecommerce.presentation.rest;


import com.example.ecommerce.bussines.facade.Impl.LocalidadFacadeImp;
import com.example.ecommerce.domain.dtos.localidadDto.LocalidadDto;
import com.example.ecommerce.domain.entities.Localidad;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidades")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class LocalidadController extends BaseControllerImp<Localidad, LocalidadDto, Long, LocalidadFacadeImp> {

    public LocalidadController(LocalidadFacadeImp facade) {
        super(facade);
    }
    private static final Logger logger = LoggerFactory.getLogger(LocalidadController.class);

    @GetMapping("findByProvincia/{idProvincia}")
    public ResponseEntity<List<LocalidadDto>> getByProvincia(@PathVariable Long idProvincia) {
        logger.info("INICIO GET BY PROVINCIA");
        return ResponseEntity.ok(facade.findByProvinciaId(idProvincia));
    }
}
