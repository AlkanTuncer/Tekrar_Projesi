package day052;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        char[] isim ={'A','L','K','A','N'};
        String ad = new String(isim);

        System.out.println(ad);

        byte[] data = ad.getBytes(StandardCharsets.UTF_8);
        System.out.println(data);
        System.out.println(Arrays.toString(data));



    }
}
