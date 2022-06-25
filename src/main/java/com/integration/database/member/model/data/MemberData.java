package com.integration.database.member.model.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

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
    @Embedded private Time time;

    @Embeddable
    @Data
    @AllArgsConstructor
    public static class Time {

        private long firstLogin;
        private long lastLogin;
        private long membershipDeadline;

        public Time() {}

    }

}
