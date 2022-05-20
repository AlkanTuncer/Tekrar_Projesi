package day053;

public class MainStringBuilder {
    public static void main(String[] args) {

        // StringBuilder   - Yapılan değişiklikler orjinal nesnede değişiklik yapar. String'den farklıdır.

        StringBuilder sb = new StringBuilder();

        // append  - nesneye ekleme yapabiliriz yani değiştirilebilir.
        sb.append("Merhaba,");
        sb.append("\n");
        sb.append("Bu mektup hal hatır sormak amacıyla kaleme alınmıştır.");

        System.out.println(sb.toString());

        System.out.println();

        // reverse
        // Başka bir referansa atasak bile orjinal nesne gene değişir.
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
        System.out.println(sb);

        System.out.println();

        // insert   - Belirli indeksten ekleme yapar.
        StringBuilder sb1 = new StringBuilder("Dante Jugking");
        sb1.insert(12,"SA");

        System.out.println(sb1);

        // delete  - secili indeksleri siler. üstte eklediklerimi sildim.
        sb1.delete(12,14);
        System.out.println(sb1);


    }
}
