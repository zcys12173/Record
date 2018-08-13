package com.syc.record.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

public class ResponseUtils {
    public static String req2RawString(HttpServletRequest request) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = request.getReader();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
            if (sb.length() > 1) {
                sb.replace(sb.length() - 1, sb.length(), "");
            }
        } catch (IOException e) {
            System.out.println("RequestUtil,IOException:" + e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("RequestUtil,IOException:" + e);
                }
            }
        }
        String str = sb.toString();
        System.out.println("Request Result:" + str);
        return str;
    }
}
