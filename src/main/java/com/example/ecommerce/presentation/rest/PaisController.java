package com.example.ecommerce.presentation.rest;


import com.example.ecommerce.bussines.facade.Impl.PaisFacadeImp;
import com.example.ecommerce.domain.dtos.paisDto.PaisDto;
import com.example.ecommerce.domain.entities.Pais;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class PaisController extends BaseControllerImp<Pais, PaisDto,Long, PaisFacadeImp> {

    public PaisController(PaisFacadeImp facade) {
        super(facade);
    }
}
