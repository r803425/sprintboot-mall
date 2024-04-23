package com.ryan.sprintbootmall.dao;

import com.ryan.sprintbootmall.dto.ProductRequest;
import com.ryan.sprintbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
