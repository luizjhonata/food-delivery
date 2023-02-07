package com.luizjhonata.delivery.controllers;

import com.luizjhonata.delivery.dto.ProductDTO;
import com.luizjhonata.delivery.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll(){
        List<ProductDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

}
