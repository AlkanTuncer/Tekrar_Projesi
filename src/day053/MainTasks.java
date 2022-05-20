package day053;

import java.util.Arrays;
import java.util.Scanner;

public class MainTasks {
    public static void main(String[] args) {

        // Task 1
        Scanner input = new Scanner(System.in);

        System.out.println("Karşılaştırmak istediğiniz sayıları giriniz :");
        System.out.print("Sayı 1  : ");
        int sayi1 = input.nextInt();
        System.out.print("Sayı 2  : ");
        int sayi2 = input.nextInt();

        if (sayi1>sayi2){
            System.out.println(sayi1+" daha büyüktür.");
        }else if (sayi1<sayi2){
            System.out.println(sayi1+" daha küçüktür.");
        }else{
            System.out.println("İki sayı eşitir.");
        }

        // Task 2
        int x = 5 , y = 7;
        System.out.println(String.format("x = %d , y = %d",x,y));
        int q = x;
        x = y;
        y = q;
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        // Task 3
        int a = 5;
        int b = 3;
        if (a>b){
            System.out.println(1);
        }else if (a<b){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }

        // Task 3 - Ternary
        int result = a>b ? 1 : b>a ? -1 : 0 ;
        System.out.println(result);

        // Task 4
        int secim = 7;
        switch (secim){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Tanımlı değil");
                break;
        }

        // Task 5
        int[] values = {2,4,6};
        int toplam = 0;
        for (int i = 0; i < values.length; i++) {
            toplam += values[i];
        }
        System.out.println("Toplam = "+toplam);
        System.out.println();

        int summ = 0;
        for (int value : values){
            summ += value;
        }
        System.out.println("Toplam = "+summ);

        // Task 6
        char[] chars = {'F','A','R'};
        int toplam1 = 0;
        for (int i = 0; i < chars.length; i++) {
            toplam1 += chars[i];
        }
        int ortalama = toplam1 / chars.length;
        System.out.println("Ortalama = "+ortalama);
        System.out.println("Ortalama = "+(char)ortalama);

        // Task 7
        boolean flag = true;
        while (true){
            System.out.println("Sonsuz döngüye girildi.");
            if (flag) {
                System.out.println("Flag true");
                break;
            }
        }

        // Task 8
        for (int i = 2; i <=10 ; i+=2) {
                System.out.printf("%d\t%d\n",i,i*i);
        }

        // Task 9
        for (int i = 500; i <=1000 ; i++) {
            if (i%7==0 && i%11==0){     // if(i%77==0)
                System.out.print(i+" ");
            }
        }

        // Task 10
        int[] sayilar = new int[10];
        System.out.println("Lütfen 10 adet sayı giriniz.");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1)+". Sayı : ");
            sayilar[i] = input.nextInt();;
        }

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
