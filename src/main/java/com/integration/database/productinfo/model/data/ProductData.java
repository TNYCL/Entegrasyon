package com.integration.database.productinfo.model.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "integration_product_data")
public class ProductData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long      id;
    private String    trendyol;
    private String    hepsiburada;
    private String    n11;

    public ProductData() {}

}
