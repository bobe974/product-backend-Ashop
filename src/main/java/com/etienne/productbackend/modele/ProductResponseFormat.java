package com.etienne.productbackend.modele;

import java.util.List;

public class ProductResponseFormat {
    private List<Product> data;

    public ProductResponseFormat(List<Product> data) {
        this.data = data;
    }

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }
}

