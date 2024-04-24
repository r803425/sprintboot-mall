package com.ryan.sprintbootmall.dao;

import com.ryan.sprintbootmall.constant.ProductCategory;
import com.ryan.sprintbootmall.dto.ProductRequest;
import com.ryan.sprintbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
