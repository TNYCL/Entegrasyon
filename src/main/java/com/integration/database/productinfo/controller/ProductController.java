package com.integration.database.productinfo.controller;

import com.integration.api.util.UtilRequest;
import com.integration.database.productinfo.model.data.ProductData;
import com.integration.database.productinfo.model.profile.ProductProfile;
import com.integration.database.productinfo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "trendyol/{productid}")
    private <T> Object getTrendyolProduct(@PathVariable("productid") Object productid) {
        ProductData generalData = productService.getProductByTrendyolId(productid.toString());

        Map<String, Object> output = new LinkedHashMap<>();
        output.put("status", 1);
        output.put("error", true);
        output.put("message", "Trendyol platformundaki ürün veritabanında bulunamadı.");

        if(generalData == null) return output;
        return new ProductProfile(generalData);
    }

    @GetMapping(value = "hepsiburada/{productid}")
    private <T> Object getHepsiburadaProduct(@PathVariable("productid") Object productid) {
        ProductData generalData = productService.getProductByHepsiburadaId(productid.toString());

        Map<String, Object> output = new LinkedHashMap<>();
        output.put("status", 1);
        output.put("error", true);
        output.put("message", "Hepsiburada platformundaki ürün veritabanında bulunamadı.");

        if(generalData == null) return output;
        return new ProductProfile(generalData);
    }

    @GetMapping(value = "n11/{productid}")
    private <T> Object getN11Product(@PathVariable("productid") Object productid) {
        ProductData generalData = productService.getProductByTrendyolId(productid.toString());

        Map<String, Object> output = new LinkedHashMap<>();
        output.put("status", 1);
        output.put("error", true);
        output.put("message", "N11 platformundaki ürün veritabanında bulunamadı.");

        if(generalData == null) return output;
        return new ProductProfile(generalData);
    }

}
