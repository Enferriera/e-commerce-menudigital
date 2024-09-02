package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.UsuarioService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImp<Usuario,Long> implements UsuarioService {
}
