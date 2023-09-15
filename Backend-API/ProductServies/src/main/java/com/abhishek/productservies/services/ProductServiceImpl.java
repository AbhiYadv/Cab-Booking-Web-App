package com.abhishek.productservies.services;


import com.abhishek.productservies.entity.Product;
import com.abhishek.productservies.models.ProductRequest;
import com.abhishek.productservies.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Log4j2
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements  ProductService {

    @Autowired
    private final ProductRepository productRepository;


    @Override
    public long addProduct(ProductRequest productRequest) {

        log.info("Adding the products");
        Product product= Product.builder().productName(productRequest.getName())
                .quantity(productRequest.getQuantity())
                .discription(productRequest.getDiscription())
                .price(productRequest.getPrice()).build();
productRepository.save(product);
log.info("Product {} is Created", product.getId());
        return 0;
    }
}
