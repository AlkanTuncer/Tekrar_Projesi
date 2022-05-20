package day053;

import java.util.Arrays;

public class Task11_12_13 {
    public static void main(String[] args) {

        int[] sayilar = {1,5,250,75,302,100,2,6,124,99,100,212,6,100,7};
        int[] durum = new int[3];

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]==100){
                durum[0]++;
            }else if (sayilar[i]>100){
                durum[1]++;
            }else{
                durum[2]++;
            }
        }

        System.out.println(Arrays.toString(durum));
        System.out.println("Eşit Olanlar : "+durum[0]);
        System.out.println("Büyük Olanlar : "+durum[1]);
        System.out.println("Küçük Olanlar : "+durum[2]);

        System.out.println();

        // Task 12
        for (int i = 0; i < durum.length; i++) {
            System.out.print(i == 0 ? "E : " : i == 1 ? "B : " : "K : ");
            System.out.println("* ".repeat(durum[i]));
        }

        // Task 13  - Sayılar dizisini küçükten büyüğe sıralama
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        // Task 14  - Sayılar dizisini büyükten küçüğe sıralama.
        int[] buyuktenKucuge = new int[sayilar.length];
        for (int i = 0; i < buyuktenKucuge.length ; i++) {
            buyuktenKucuge[i] = sayilar[buyuktenKucuge.length-i-1];
        }
        System.out.println(Arrays.toString(buyuktenKucuge));

    }
}
