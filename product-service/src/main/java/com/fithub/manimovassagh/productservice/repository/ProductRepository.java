package com.fithub.manimovassagh.productservice.repository;

import com.fithub.manimovassagh.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
}
