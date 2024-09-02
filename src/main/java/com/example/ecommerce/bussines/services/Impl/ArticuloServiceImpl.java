package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.ArticuloService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Articulo;
import com.example.ecommerce.repositories.ArticuloRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloServiceImpl extends BaseServiceImp<Articulo,Long> implements ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public boolean existsArticuloByAlergeno(Long idAlergeno){
        return articuloRepository.existsArticuloByAlergeno(idAlergeno);
    }

    @Override
   public List<Articulo> findAllBySucursalId(Long idSucusal){
        return articuloRepository.findAllBySucursalId(idSucusal);
    }




    @Override
    public Page<Articulo> findAllBySucursalIdPaged(Long idSucursal, Pageable pageable){
        return articuloRepository.findAllBySucursalIdPaged(idSucursal,pageable);
    }


    @Override
    public List<Articulo> findAllByCategoriaId(Long idCategoria){
        return articuloRepository.findAllByCategoriaId(idCategoria);
    }

    @Override
    public Page<Articulo> findAllByCategoriaIdPaged(Long idCategoria, Pageable pageable){
        return articuloRepository.findAllByCategoriaIdPaged(idCategoria, pageable);
    }

    @Override
    public List<Articulo> findAllHabilitadoBySucursalId(Long sucursalId){
        return articuloRepository.findAllHabilitadoBySucursalId(sucursalId);
    }



}
