package day055.task_shopping;

import com.sun.security.jgss.GSSUtil;

public class MainTask {
    public static void main(String[] args) {

        AbstractProduct ap;

        AbstractProduct p1 = new Product();
        AbstractProduct p2 = new DigitalProduct();

        CheckOut checkOut = new CheckOut();
        checkOut.addProduct(new Product("0001","Java Kitabı",45.5,-1));
        checkOut.addProduct(new Product("0002","C# Kitabı",35.8,-1));
        checkOut.addProduct(new DigitalProduct("D001","Python Kitabı (pdf)",7.45));
        checkOut.addProduct(new DigitalProduct("D002","Javascript Kitabı (pdf)",9.0));
        checkOut.addProduct(new DigitalProduct("D003","Çocuk Gelişim Kitabı (pdf)",17.0));
        checkOut.addProduct(new Product("0007","Sehpa",40.0,5));

        System.out.println("Toplam Ücret = "+checkOut.calculate());
        System.out.println();

        DigitalProduct dp = (DigitalProduct)checkOut.getProducts().get(2);
        dp.display();
        dp.list();

        System.out.println();

        Product p53 = (Product) checkOut.getProducts().get(0);
        p53.display();
        p53.list();

        System.out.println();

        // Tüm Liste
        for (AbstractProduct p : checkOut.getProducts()){
            ((IList)p).list();
        }

        System.out.println("-".repeat(53));

        // Tüm Kartlar
        for (AbstractProduct p : checkOut.getProducts()){
            ((ICard)p).display();
        }

    }
}
