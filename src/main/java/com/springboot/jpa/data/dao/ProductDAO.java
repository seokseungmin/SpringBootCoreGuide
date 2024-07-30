package com.springboot.jpa.data.dao;

import com.springboot.jpa.data.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ProductDAO {

    Product insertProduct(Product product);

    Optional<Product> selectProduct(Long number);

    Product updateProductName(Long number, String namem) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
