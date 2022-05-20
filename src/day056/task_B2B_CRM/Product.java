package day056.task_B2B_CRM;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public record Product(int id, String name, double price) implements Serializable {

    public static boolean save(List<Product>products,String fileName){
        boolean result = false;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(products);
            result = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Product> load(String fileName){
        List<Product> products = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            products = (ArrayList<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void showList(List<Product> products) throws Exception{
        if (products == null || products.size() <1){
            throw new Exception("Product-list must not be null.");
        }
        for (Product product : products){
            System.out.println(product);
        }
    }

}
