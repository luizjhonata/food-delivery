package com.luizjhonata.delivery.services;

import com.luizjhonata.delivery.dto.ProductDTO;
import com.luizjhonata.delivery.entities.Product;
import com.luizjhonata.delivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }


    @Transactional
    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }

    //SERVICE para inserir novos produtos
    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product product = new Product(null, dto.getName(), dto.getDescription(), dto.getPrice(), dto.getImageUri());
        product = repository.save(product);
        return new ProductDTO(product);
    }

}
