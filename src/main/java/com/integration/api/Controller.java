package com.integration.api;

import com.integration.security.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping(value = "/api/config", produces = MediaType.APPLICATION_JSON_VALUE)
    private <T> Object getConfig() {
        return Configuration.Trendyol.BASIC_AUTH;
    }

}
