package com.integration.database.member.model.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "entegrasyon_member_data")
public class MemberData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userId;
    private String licenseKey;
    private String userName;
    private String usedComputerHWID;
    private long firstLogin;
    private long lastLogin;
    private long membershipDeadline;
    @ElementCollection(fetch = FetchType.EAGER) @CollectionTable(name = "entegrasyon_member_product") private Set<Products> products;

    public MemberData() {}

    public Products getProductByTrendyol(String barcode) {
        return this.products.stream().filter(product -> product.getTrendyol().equals(barcode)).findFirst().orElse(null);
    }

    @Embeddable
    @Data
    @AllArgsConstructor
    public static class Products {

        private String trendyol;
        private String hepsiburada;
        private String n11;

        public Products() {}

    }

}
