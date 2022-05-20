package day055.task_shopping;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] sayilar = {4,1,7,19,3,5};
        System.out.println(Arrays.toString(sayilar));

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));


        Product[] products = {
                new Product("0053","Lazkopat'ın Anıları",53.53,5.3),
                new Product("0007","CR7 Golleri",7.0,1.0),
                new Product("0001","Canyon'dan Gankler",150.0,1.0)
        };

        System.out.println(Arrays.toString(products));

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));

    }
}
