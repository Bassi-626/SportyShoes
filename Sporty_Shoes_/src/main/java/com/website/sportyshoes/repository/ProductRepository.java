package com.website.sportyshoes.repository;

import org.springframework.data.repository.CrudRepository;

import com.website.sportyshoes.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
