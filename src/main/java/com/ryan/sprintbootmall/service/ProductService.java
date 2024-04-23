package com.ryan.sprintbootmall.service;

import com.ryan.sprintbootmall.dto.ProductRequest;
import com.ryan.sprintbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
