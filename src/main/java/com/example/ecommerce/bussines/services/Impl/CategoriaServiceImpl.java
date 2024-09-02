package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.CategoriaService;
import com.example.ecommerce.bussines.services.SucursalService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Articulo;
import com.example.ecommerce.domain.entities.Categoria;
import com.example.ecommerce.domain.entities.Sucursal;
import com.example.ecommerce.repositories.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl extends BaseServiceImp<Categoria,Long> implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private SucursalService sucursalService;

    @Override
    public List<Categoria> findAllCategoriasPadreBySucursalId(Long idSucursal){
        return categoriaRepository.findAllCategoriasPadreBySucursalId(idSucursal);
    }


    @Override
   public List<Categoria> findAllCategoriasByEmpresaId( Long idEmpresa){
        return categoriaRepository.findAllCategoriasByEmpresaId(idEmpresa);
    }


    @Override
    public List<Categoria> findAllSubCategoriasByCategoriaPadreId(Long id){
        return categoriaRepository.findAllSubCategoriasByCategoriaPadreId(id);
    }

    @Override
    public Categoria getById(Long id) {
      var categoria = categoriaRepository.getById(id);
        if (categoria == null) {
            throw new RuntimeException("No  existe la categoria con el id: " + id );
        }
       categoria.setArticulos(getObjetosInternosNoEliminados(categoria.getArticulos()));

        return categoria;
    }

    private Set<Articulo> getObjetosInternosNoEliminados(Set<Articulo> articulos) {
        return articulos.stream()
                .filter(art -> !art.isEliminado())
                .collect(Collectors.toSet());
    }

    @Override
    public  List<Categoria> findAllCategoriasBySucursalId(Long idSucursal){
        return categoriaRepository.findAllCategoriasBySucursalId(idSucursal);
    }

    @Override
    public  List<Categoria> findSubcategoriasBySucursalId( Long idSucursal){
        return categoriaRepository.findSubcategoriasBySucursalId(idSucursal);
    }
}
