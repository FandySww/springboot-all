package com.excel.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author fandayong
 * @Date 2021/2/20 10:54 AM
 * @description
 */
public class MD5Utils {
    public static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code.toUpperCase();
    }

    public static void main(String[] args) {
        String md5 = stringToMD5("f57bafb35ee511eb990b0c42a106ce721613789045OFUOMQMJJWIL806IPTONZO7PNTTGIWND");
        int a = 0;
    }
}
