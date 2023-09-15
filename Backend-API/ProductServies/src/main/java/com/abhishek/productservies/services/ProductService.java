package com.abhishek.productservies.services;

import com.abhishek.productservies.models.ProductRequest;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
}
