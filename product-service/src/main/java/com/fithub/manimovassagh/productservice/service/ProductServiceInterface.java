package com.fithub.manimovassagh.productservice.service;

import com.fithub.manimovassagh.productservice.dto.ProductRequest;
import com.fithub.manimovassagh.productservice.dto.ProductResponse;
import com.fithub.manimovassagh.productservice.model.Product;

import java.util.List;

public interface ProductServiceInterface {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    public ProductResponse mapToProductResponse(Product product);
}
