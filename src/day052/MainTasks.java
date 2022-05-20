package day052;

public class MainTasks {
    public static void main(String[] args) {

        // Task 1
        int ogrenciYasi = 24;

        // Task 2
        double koliAgirligi = 4.5;

        // Task 3
        boolean kutuDoluMu = false;

        // Task 4
        float birimFiyat = 21.50F;

        // Task 5
        char medeniHalEvli = 'E';
        char medeniHalBekar = 'B';

        // Task 6
        long evreninYasi = 14_000_000_000L;

        // Task 7
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        System.out.println("Byte İlkel Veri Tipi Maksimum Değeri = "+max);
        System.out.println("Byte İlkel Veri Tipi Minimum Değeri = "+min);

        // Task 8
        byte b1 = 120;
        short s1 = 1600;
        short s2 = (short)(s1+b1);

        // Task 9
        String name = "Alkan";
        System.out.printf("Benim adım %s. ",name);

        // Task 10
        int yil = 1992;
        int ay = 4;
        int gun = 3;
        String dogumTarihi = yil+"-"+ay+"-"+gun;
        String dogumTarihi2 = String.format("%d-%d-%d",yil,ay,gun);  // Daha verimli kod.
        System.out.println(dogumTarihi);
        System.out.println(dogumTarihi2);

        // Task 11
        int x = 5;
        x++;
        x=x+1;
        x += 53;

        // Task 12
        int y = 6;
        y--;
        y=y-1;
        y -= 53;

        // Task 13
        int z =7;
        z = z+4;
        z +=4;

        // Task 14
        double kalan = 17 % 3;

        // Task 15
        boolean dogruMu = 10>=3;

        // Task 16
        char taskOnAlti = 15<18 ? 'K' : 'B';

        // Task 17 - Statement doğru calıştı.
        int result = 11&7;   // Result = 3
        // 11 : 00001011  ->  (1x2^3)+(0x2^2)+(1x2^1)+(1x2^0) = 11
        //  7 : 00000111  ->  (1x2^2)+(1x2^1)+(1x2^0) = 7
        //  & : 00000011  = 3
        //  | : 00001111  = 15

        // Task 18 - Doğru çalışır çünkü sonuc true zaten boolean bir tip.
        // Karşılaştırma Operatörleri : < , > , >= , <= , == , !=
        boolean result2 = 11!=10;

        // Task 19 - Boolean bir değişkene atanmalıdır.
        boolean degisken = (5<2) && (7>=3);

        // Task 20
        // 5 : 00000101 >>1  00000010
        int alkan = 5>>1;
        System.out.println("Task 20 --> "+alkan);

    }
}
