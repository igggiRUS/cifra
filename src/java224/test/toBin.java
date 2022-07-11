package java224.test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class toBin {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encoding = "UTF-8";
        String someString = "Мой пароль";
        BigInteger bi = new BigInteger(1, someString.getBytes(encoding));
        System.out.println(bi.toString(2));
        System.out.println();
        System.out.println(Integer.toBinaryString((int)'М'));
    }
}
