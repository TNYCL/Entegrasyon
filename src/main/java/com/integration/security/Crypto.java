package com.integration.security;

import java.util.Arrays;

public class Crypto {

    public static String encrypt(String data) {
        return java.util.Base64.getEncoder().encodeToString(data.getBytes());
    }

    public static String decrypt(String data) {
        return Arrays.toString(java.util.Base64.getDecoder().decode(data.toString()));
    }

}
