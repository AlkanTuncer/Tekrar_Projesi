package day052;

import java.util.Arrays;
import java.util.Locale;

public class MainStringMetotlari {
    public static void main(String[] args) {

        String dante = "Dante";

        System.out.println("Orjinal Nesne : "+dante);

        // length
        int length = dante.length();
        System.out.println("Uzunluk = "+length);

        //toUpperCase
        //dante.toUpperCase();   // Değişken içerisindeki metin büyük harfe cevrilmiyor! Yeni bir nesne görüyoruz çıktıda!
        String ucDante = dante.toUpperCase();   // "DANTE" yeni bir nesne olur ve kullanmak istersek adresini bir referansa atamalıyız!
        System.out.println("UpperCase Nesnesi : "+ucDante);

        //toLowerCase
        String lcDante = dante.toLowerCase();
        System.out.println("LowerCase Nesnesi : "+lcDante);

        System.out.println("UC ve LC'den sonra orjinal nesne : "+dante);

        // replace
        String rpDante = dante.replace('D','K');
        System.out.println("replace : "+rpDante);
        System.out.println("Orjinal nesne : "+dante);

        // split
        String message = "Bu bir deneme mesajıdır";
        String[] kelimeler = message.split(" ");
        for(String kelime : kelimeler){
            System.out.println(kelime);
        }
        System.out.println(Arrays.toString(kelimeler));

        // trim - isEmpty
        String mesaj = "     Bu    bir     deneme              mesajıdır.";
        System.out.println(mesaj);
        System.out.println(mesaj.trim());
        String[] kelimeler2 = mesaj.split(" ");
        for (String kelime : kelimeler2){
            if (!kelime.isEmpty()){
            System.out.println(kelime);
            }
        }


    }
}
