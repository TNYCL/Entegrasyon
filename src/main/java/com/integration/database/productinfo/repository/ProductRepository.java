package com.integration.database.productinfo.repository;

import com.integration.database.productinfo.model.data.ProductData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductData, Long> {
}
