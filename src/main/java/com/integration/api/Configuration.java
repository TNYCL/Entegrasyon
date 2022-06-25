package com.integration.api;

import com.integration.api.util.UtilCrypto;

public class Configuration {

    public static class Trendyol {

        public static long SUPPLIER_ID = 214806;
        private static String API_KEY = "ysdMPJZ81PVS0A0tJd7u";
        private static String API_SECRET = "E84KASuX2nXQyg3Fdi5g";

        public static String BASIC_AUTH = UtilCrypto.encryptBase64(API_KEY + ":" + API_SECRET);

    }

    public static class Hepsiburada {}

    public static class N11 {}

}
