package com.integration.database.productinfo.service;

import com.integration.database.productinfo.model.data.ProductData;
import com.integration.database.productinfo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.StreamSupport;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductData getProductById(long product) { return productRepository.findById(product).get(); }

    public ProductData getProductByTrendyolId(String trendyol_productid) {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .filter(product -> product.getTrendyol().equalsIgnoreCase(trendyol_productid)).findFirst().orElse(null);
    }

    public ProductData getProductByHepsiburadaId(String hepsiburada_productid) {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .filter(product -> product.getHepsiburada().equalsIgnoreCase(hepsiburada_productid)).findFirst().orElse(null);
    }

    public ProductData getProductByN11Id(String n11_productid) {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .filter(product -> product.getN11().equalsIgnoreCase(n11_productid)).findFirst().orElse(null);
    }

    public void saveProduct(ProductData product) {
        productRepository.save(product);
    }

    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }

    public void updateProduct(ProductData product) { productRepository.save(product); }

}
