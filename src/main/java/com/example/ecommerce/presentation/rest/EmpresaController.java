package com.example.ecommerce.presentation.rest;


import com.example.ecommerce.bussines.facade.Impl.EmpresaFacadeImpl;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaDto;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaLargeDto;
import com.example.ecommerce.domain.entities.Empresa;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class EmpresaController extends BaseControllerImp<Empresa, EmpresaDto, Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @GetMapping("/full/{idEmpresa}")
    public ResponseEntity<EmpresaLargeDto> getEmpresaSucursales(@PathVariable Long idEmpresa) {
        return ResponseEntity.ok(facade.findWithSucursalesById(idEmpresa));
    }


}
