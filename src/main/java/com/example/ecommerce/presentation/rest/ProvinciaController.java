package com.example.ecommerce.presentation.rest;


import com.example.ecommerce.bussines.facade.Impl.ProvinciaFacadeImp;
import com.example.ecommerce.domain.dtos.provinciaDto.ProvinciaDto;
import com.example.ecommerce.domain.entities.Provincia;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincias")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class ProvinciaController extends BaseControllerImp<Provincia, ProvinciaDto,Long, ProvinciaFacadeImp> {
    public ProvinciaController(ProvinciaFacadeImp facade) {
        super(facade);
    }

    private static final Logger logger = LoggerFactory.getLogger(ProvinciaController.class);


    @GetMapping("findByPais/{idPais}")
    public ResponseEntity<List<ProvinciaDto>> getByProvincia(@PathVariable Long idPais) {
        logger.info("INICIO GET BY PROVINCIA");
        return ResponseEntity.ok(facade.findByPaisId(idPais));
    }
}
