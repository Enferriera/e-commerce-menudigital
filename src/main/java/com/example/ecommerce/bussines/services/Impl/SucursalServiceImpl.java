package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.SucursalService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Categoria;
import com.example.ecommerce.domain.entities.Sucursal;
import com.example.ecommerce.repositories.CategoriaRepository;
import com.example.ecommerce.repositories.DomicilioRepository;
import com.example.ecommerce.repositories.EmpresaRepository;
import com.example.ecommerce.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SucursalServiceImpl extends BaseServiceImp<Sucursal, Long> implements SucursalService {
    @Autowired
    private SucursalRepository sucursalRepository;
    @Autowired
    private DomicilioRepository domicilioRepository;
    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;





    @Override
    public List<Categoria> findCategoriasBySucursalId(Long sucursalId) {
        var sucursalExiste = sucursalRepository.getById(sucursalId);

        List<Categoria> categorias = sucursalRepository.findCategoriasBySucursalId(sucursalId);

        return categorias;
    }



    @Override
    public Set<Sucursal> findAllByEmpresaId(Long id) {
        System.out.println("INGRESE AL SERVICIO DE SUCURSALES");
        return sucursalRepository.findAllByEmpresaId(id);
    }


}
