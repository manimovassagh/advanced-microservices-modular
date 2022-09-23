package com.fithub.manimovassagh.productservice.controller;

import com.fithub.manimovassagh.productservice.dto.ProductRequest;
import com.fithub.manimovassagh.productservice.dto.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface ProductControllerInterface {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createProduct(@RequestBody ProductRequest productRequest);

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ProductResponse> getAllProducts();
}
