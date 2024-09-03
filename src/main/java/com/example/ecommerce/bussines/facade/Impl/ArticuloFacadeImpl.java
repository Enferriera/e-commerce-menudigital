package com.example.ecommerce.bussines.facade.Impl;

import com.example.ecommerce.bussines.facade.ArticuloFacade;
import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.mapper.ArticuloMapper;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.services.ArticuloService;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.articuloDto.ArticuloDto;
import com.example.ecommerce.domain.entities.Articulo;
import com.example.ecommerce.repositories.ArticuloRepository;
import com.example.ecommerce.utils.config.DbCacheConfig;
import jakarta.annotation.PostConstruct;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloFacadeImpl extends BaseFacadeImp<Articulo, ArticuloDto,Long> implements ArticuloFacade {

    public ArticuloFacadeImpl(BaseService<Articulo, Long> baseService, BaseMapper<Articulo, ArticuloDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ArticuloMapper articuloMapper;

    @Autowired
    private ArticuloService articuloService;

    @Autowired
    private RedissonClient redissonClient;



    @Override
    public List<ArticuloDto> findAllBySucursalId(Long idSucusal){
        return articuloMapper.toDTOsList(articuloService.findAllBySucursalId(idSucusal));
    }

  /*  @PostConstruct
    public void subscribeToProductUpdatedChannel() {
        RTopic topic = redissonClient.getTopic("product-updated");
        topic.addListener(Long.class, (channel, productId) -> {
            // refresh the cache for the updated product
            System.out.println("Se actualizo la cache");
            findAllBySucursalId(productId);
        });
    }*/



    @Override
    @Cacheable(value = DbCacheConfig.CACHE_NAME_PRODUCTOS)
    public Page<ArticuloDto> findAllBySucursalIdPaged(Long idSucursal, Pageable pageable){
        return articuloMapper.toDTOsPage(articuloService.findAllBySucursalIdPaged(idSucursal, pageable));
    }

    @Override
    public List<ArticuloDto> findAllByCategoriaId(Long idCategoria) {
        return articuloMapper.toDTOsList(articuloService.findAllByCategoriaId(idCategoria));
    }

    @Override
    public Page<ArticuloDto> findAllByCategoriaIdPaged(Long idCategoria, Pageable pageable) {
        return articuloMapper.toDTOsPage(articuloService.findAllByCategoriaIdPaged(idCategoria, pageable));
    }

    @Override
    public List<ArticuloDto> findAllHabilitadoBySucursalId(Long sucursalId){
        return articuloMapper.toDTOsList(articuloService.findAllHabilitadoBySucursalId(sucursalId));
    }


}
