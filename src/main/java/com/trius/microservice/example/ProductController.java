package com.trius.microservice.example;

import com.trius.microservice.example.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/list")
    public List<Product> getAllMovies() {

        List<Product> products = new ArrayList<Product>();

        products.add(new Product("A Book", "25$"));
        products.add(new Product("A Table", "12$"));

        return products;
    }
}
