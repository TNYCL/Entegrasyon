package com.integration.api.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class UtilRequest {

    public static String sendPostRequest(String requestUrl, String payload/*, MarketType marketType*/) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type","application/json");
            connection.setRequestProperty("Accept", "application/json");
            /*if(marketType == MarketType.TRENDYOL) connection.setRequestProperty("Authorization", "Basic " + Configuration.Trendyol.BASIC_AUTH);
            else if(marketType == MarketType.HEPSIBURADA) connection.setRequestProperty("Authorization", "Basic " + Configuration.Trendyol.BASIC_AUTH);*/

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            writer.write(payload);
            writer.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonString = new StringBuffer();
            String line;

            while ((line = br.readLine()) != null) {
                jsonString.append(line);
            }
            br.close();
            connection.disconnect();
            return jsonString.toString();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Failed successfully");
        }
        return null;
    }

}
