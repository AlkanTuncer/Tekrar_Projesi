package day053;

public class Main {
    public static void main(String[] args) {

        // charAT     012345
        String str = "Deneme";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // replace
        String str2 = str.replace('e','a');     // Orjinal nesne değişmedi. Yeni bir nesne oluştu ve
        System.out.println(str);                               // onu kullanmak için yeni bir referansa atamalıyız.
        System.out.println(str2);

        // substring                                Deneme
        System.out.println(str.substring(2));   //   neme    2.indeksten en sona kadar.
        System.out.println(str.substring(2,5)); //   nem     5.indeks dahil değil. Bitiş indeksi 5 ama 6 verirsek hata vermez. 6'dan büyük olursa hata verir.
        System.out.println(str.substring(1,str.length()));

        // indexOf
        System.out.println(str.indexOf(68));   // 69 desek -1 döner. 'E' Stringimizde yok.
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("e",4));  // 4'den baslatınca 5.indeksteki e yi verdi.

        // lastIndexOf
        System.out.println(str.lastIndexOf('e'));
        System.out.println();

        int ndx = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                ndx = str.indexOf('e',ndx+1);
                System.out.println(ndx);
            }
        }

        // concat
        String str53 = str.concat(" 1 2 3");   // Orjinal nesne değişmedi.
        System.out.println(str);               // Hala Deneme
        System.out.println(str53);             // Yeni bir nesne oluştu Deneme 1 2 3

        System.out.println(str.concat(" 53 53").concat(" 5 3 5 3"));

        // contains
        if(str.contains("ne")) System.out.println("Var");
        else System.out.println("Yok");

        if(str.contains("Ne")) System.out.println("Var");
        else System.out.println("Yok");

    }
}
