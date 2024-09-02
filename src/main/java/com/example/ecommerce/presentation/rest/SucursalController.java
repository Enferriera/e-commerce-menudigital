package com.example.ecommerce.presentation.rest;



import com.example.ecommerce.bussines.facade.Impl.SucursalFacadeImp;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.dtos.sucursalDto.SucursalDto;
import com.example.ecommerce.domain.entities.Sucursal;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class SucursalController extends BaseControllerImp<Sucursal, SucursalDto,Long, SucursalFacadeImp> {
    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImp.class);
    public SucursalController(SucursalFacadeImp facade) {
        super(facade);
    }



    @GetMapping("/porEmpresa/{idEmpresa}")
    public List<SucursalDto> getSucursalesByEmpresaId(@PathVariable Long idEmpresa) {
        return facade.findAllByEmpresaId(idEmpresa);
    }
}
