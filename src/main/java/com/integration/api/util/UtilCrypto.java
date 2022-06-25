package com.integration.api.util;

import java.util.Arrays;
import java.util.Base64;

public class UtilCrypto {

    public static String encryptBase64(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    public static String decryptBase64(String data) { return Arrays.toString(Base64.getDecoder().decode(data.toString())); }

}
