package com.example.ecommerce.presentation.rest;


import com.example.ecommerce.bussines.facade.Impl.CategoriaFacadeImpl;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaDto;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaShortDto;
import com.example.ecommerce.domain.entities.Categoria;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class CategoriaController extends BaseControllerImp<Categoria, CategoriaDto, Long, CategoriaFacadeImpl> {

    public CategoriaController(CategoriaFacadeImpl facade) {
        super(facade);
    }


    //OBTIENE SOLO CATEGORIAS PADRE DE UNA SUCURSAL
    @GetMapping("/allCategoriasPadrePorSucursal/{idSucursal}")
    public ResponseEntity<List<CategoriaDto>> getAllCategoriaPadreBySucursalId(@PathVariable Long idSucursal){
        return ResponseEntity.ok().body(facade.findAllCategoriasPadreBySucursalId(idSucursal));
    }

    //OBTIENE TODAS LAS CATEGORIAS DE UNA SUCURSAL
    @GetMapping("/allCategoriasPorSucursal/{idSucursal}")
    public ResponseEntity<List<CategoriaShortDto>> getAllCategoriaBySucursalId(@PathVariable Long idSucursal){
        return ResponseEntity.ok().body(facade.findAllCategoriasBySucursalId(idSucursal));
    }

    @GetMapping("/allCategoriasPorEmpresa/{idEmpresa}")
    public ResponseEntity<List<CategoriaDto>> getAllCategoriaByEmpresaId(@PathVariable Long idEmpresa){
        return ResponseEntity.ok().body(facade.findAllCategoriasByEmpresaId(idEmpresa));
    }



    @GetMapping("/allSubCategoriasPorCategoriaPadre/{idCategoriaPadre}")
    public ResponseEntity<List<CategoriaDto>> getAllSubCategoriaByCategoriaPadreId(@PathVariable Long idCategoriaPadre) {
        return ResponseEntity.ok().body(facade.findAllSubCategoriasByCategoriaPadreId(idCategoriaPadre));
    }

    @GetMapping("/allSubCategoriasPorSucursal/{idSucursal}")
    public ResponseEntity<List<CategoriaDto>> getAllSubCategoriaBySucursalId(@PathVariable Long idSucursal) {
        return ResponseEntity.ok().body(facade.findSubcategoriasBySucursalId(idSucursal));
    }

}
