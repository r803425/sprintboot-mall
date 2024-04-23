package com.ryan.sprintbootmall.service.impl;

import com.ryan.sprintbootmall.dao.ProductDao;
import com.ryan.sprintbootmall.model.Product;
import com.ryan.sprintbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}