package com.example.ecommerce.presentation.rest;


import com.example.ecommerce.bussines.facade.Impl.DomicilioFacadeImp;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioCreateDto;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioDto;
import com.example.ecommerce.domain.entities.Domicilio;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioDto,Long, DomicilioFacadeImp> {
    public DomicilioController(DomicilioFacadeImp facade) {
        super(facade);
    }

    @PostMapping("/create")
    public ResponseEntity<DomicilioDto> createDomicilio(@RequestBody DomicilioCreateDto dto) {
        return ResponseEntity.ok().body(facade.createDomicilio(dto));
    }

}
