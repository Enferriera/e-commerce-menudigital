package com.example.ecommerce.bussines.services.base;


import com.example.ecommerce.domain.entities.Base;
import com.example.ecommerce.repositories.BaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public abstract class BaseServiceImp<E extends Base,ID extends Serializable> implements BaseService<E, ID> {

    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImp.class);

    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    @Override
    public E create(E request){
        var newEntity = baseRepository.save(request);
        //logger.info("Creada entidad {}",newEntity);
        return newEntity;
    }

    @Override
    public E getById(ID id){
        var entity = baseRepository.getById(id);
        //logger.info("Obtenida entidad {}",entity);
        return entity;
    }

    @Override
    public List<E> getAll(){
        var entities = baseRepository.findAll();
        //logger.info("Obtenidas entidades {}",entities);
        return entities;
    }

    @Override
    public Page<E> getAllPaged(Pageable pageable){
        var entities = baseRepository.findAll(pageable);
        //logger.info("Obtenidas entidades {}",entities);
        return entities;
    }

    @Override
    public List<E> getAllByEliminadoFalse(){
        var entities = baseRepository.findAllByEliminadoFalse();
        //logger.info("Obtenidas entidades {}",entities);
        return entities;
    }

    @Override
    public Page<E> getAllPagedByEliminadoFalse(Pageable pageable){
        var entities = baseRepository.findAllByEliminadoFalse(pageable);
        //logger.info("Obtenidas entidades {}",entities);
        return entities;
    }

    @Override
    public void deleteById(ID id){
        var entity = getById(id);
        baseRepository.delete(entity);
        //logger.info("Borrada logicamente entidad {}",entity);
    }

    @Override
    public E update(E request, ID id){
        var optionalEntity = baseRepository.getById(id);

        var newEntity = baseRepository.save(request);

        return newEntity;
    }
}
