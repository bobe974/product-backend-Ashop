package com.etienne.productbackend.services;

import com.etienne.productbackend.exceptions.ProductNotFoundException;
import com.etienne.productbackend.modele.Product;
import com.etienne.productbackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImpl {
    private ProductRepository productRepository;

    public ProductImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> readAll(){
        return productRepository.findAll();
    }

    public Product readById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElseThrow(() -> new ProductNotFoundException("Produit non trouvé avec l'id : " + id));
    }

    public void create(Product product) {
        try {
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println("erreur lors de la création du produit : " + e.getMessage());
            throw new RuntimeException("erreur lors de la création du produit", e);
        }
    }

    public void update(Long id, Product updatedProduct) {
        if (id == null) {
            throw new IllegalArgumentException("l'id du produit est null");
        }
        //rechercher du produit par id
        Product actualProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("produit avec l'id : " + id + " est introuvable"));

        actualProduct.setCode(updatedProduct.getCode());
        actualProduct.setName(updatedProduct.getName());
        actualProduct.setDescription(updatedProduct.getDescription());
        actualProduct.setPrice(updatedProduct.getPrice());
        actualProduct.setQuantity(updatedProduct.getQuantity());
        actualProduct.setInventoryStatus(updatedProduct.getInventoryStatus());
        actualProduct.setCategory(updatedProduct.getCategory());
        actualProduct.setImage(updatedProduct.getImage());
        actualProduct.setRating(updatedProduct.getRating());
        // enregistrer les modifications
        productRepository.save(actualProduct);
    }

    public void deleteById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("l'id du produit est null");
        }
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
            throw new ProductNotFoundException("produit avec l'id : " + id + " est introuvable");
        }
    }


}
