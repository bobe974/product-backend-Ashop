package com.etienne.productbackend.controller;

import com.etienne.productbackend.exceptions.ProductNotFoundException;
import com.etienne.productbackend.modele.Product;
import com.etienne.productbackend.modele.ProductResponseFormat;
import com.etienne.productbackend.services.ProductImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "products")
@RestController
public class ProductContoller {
    private ProductImpl productService;

    public ProductContoller(ProductImpl productService){
        this.productService =productService;
    }
    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        productService.create(product);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(product.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
    @GetMapping()
    public ProductResponseFormat getAllProducts() {
        List<Product> productList = productService.readAll();
        return new ProductResponseFormat(productList);
    }
    @GetMapping(path = "{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.readById(id);
    }

    @PatchMapping(path = "{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product){
        if(Objects.isNull(product)){
            return ResponseEntity.noContent().build();
        }
        productService.update(id, product);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(product.getId())
                .toUri();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        try {
            productService.deleteById(id);
            return ResponseEntity.noContent().build();
        }catch (ProductNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

}
