package day055.serilestirme;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Personel p1 = new Personel("001","Canyon","Jugking",7000);

        String filename = "src/personel.dat";

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(p1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Yazdırdıgımız Dosyayı Okuma

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            Personel p =(Personel) ois.readObject();
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
