package com.example.ecommerce.presentation.rest;

import com.example.ecommerce.bussines.services.ImagenArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imagenArticulos")
@CrossOrigin(origins = {"https://dashboard-menu-project.vercel.app", "http://localhost:5173"})

public class ImagenArticuloController {
    @Autowired
    public ImagenArticuloService imagenArticuloService;

    @DeleteMapping("/{idImage}")
    public void deleteImage(@PathVariable Long idImage){
        imagenArticuloService.deleteById(idImage);
    }
}
