package com.springboot.jpa.service.impl;

import com.springboot.jpa.data.repository.ProductRepository;
import com.springboot.jpa.service.ProductService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import({ProductServiceImpl.class})
public class ProductServiceTest2 {

    @MockBean
    ProductRepository productRepository;

    ProductService productService;
}
