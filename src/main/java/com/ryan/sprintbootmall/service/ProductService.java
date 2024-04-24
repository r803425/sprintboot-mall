package com.ryan.sprintbootmall.service;

import com.ryan.sprintbootmall.dto.ProductQueryParams;
import com.ryan.sprintbootmall.dto.ProductRequest;
import com.ryan.sprintbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
