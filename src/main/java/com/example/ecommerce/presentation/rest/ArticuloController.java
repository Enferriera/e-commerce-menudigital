package com.example.ecommerce.presentation.rest;

import com.example.ecommerce.bussines.facade.Impl.ArticuloFacadeImpl;
import com.example.ecommerce.domain.dtos.articuloDto.ArticuloDto;
import com.example.ecommerce.domain.entities.Articulo;
import com.example.ecommerce.presentation.rest.Base.BaseControllerImp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulos")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class ArticuloController extends BaseControllerImp<Articulo, ArticuloDto,Long, ArticuloFacadeImpl> {
    public ArticuloController(ArticuloFacadeImpl facade) {
        super(facade);
    }

    @GetMapping("/porSucursal/{idSucursal}")
    public ResponseEntity<List<ArticuloDto>> getArticulosPorSucursal(@PathVariable Long idSucursal) {
        return ResponseEntity.ok().body(facade.findAllBySucursalId(idSucursal));
    }

    @GetMapping("/porCategoria/{idCategoria}")
    public ResponseEntity<List<ArticuloDto>> getArticulosPorCategoria(@PathVariable Long idCategoria) {
        return ResponseEntity.ok().body(facade.findAllByCategoriaId(idCategoria));
    }

    @GetMapping("/pagedPorSucursal/{idSucursal}")
    public ResponseEntity<Page<ArticuloDto>> getArticulosPorSucursalPaged(@PathVariable Long idSucursal, Pageable pageable) {
        return ResponseEntity.ok().body(facade.findAllBySucursalIdPaged(idSucursal, pageable));
    }

    @GetMapping("/pagedPorCategoria/{idCategoria}")
    public ResponseEntity<Page<ArticuloDto>> getArticulosPorCategoriaPaged(@PathVariable Long idCategoria, Pageable pageable) {
        return ResponseEntity.ok().body(facade.findAllByCategoriaIdPaged(idCategoria, pageable));
    }



    @GetMapping("/getArticulosHabilitadosBySucursal/{sucursalId}")
    public ResponseEntity<List<ArticuloDto>> findAllHabilitadoBySucursalId(@PathVariable Long sucursalId){
        return ResponseEntity.ok().body(facade.findAllHabilitadoBySucursalId(sucursalId));
    }

    @GetMapping("/getImagesByArticuloId/{id}")
    public ResponseEntity<?> getAllImages(@PathVariable Long id) {
        try {
            return facade.getAllImagesByArticuloId(id); // Llama al método del servicio para obtener todas las imágenes
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Manejo básico de errores, se puede mejorar para devolver una respuesta más específica
        }
    }


}
