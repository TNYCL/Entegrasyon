package com.integration.database.productinfo.model.profile;

import com.integration.database.productinfo.model.data.ProductData;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductProfile {

    private long id;
    private String trendyol;
    private String hepsiburada;
    private String n11;

    public ProductProfile(ProductData data) {
        this.id = data.getId();
        this.trendyol = data.getTrendyol();
        this.hepsiburada = data.getHepsiburada();
        this.n11 = data.getN11();
    }

}
