package day056.task_B2B_CRM;

import java.util.ArrayList;
import java.util.List;

public record Order(int id, Customer customer, List<Product> products) {

    public Order(int id,Customer customer) {
        this(id,customer,new ArrayList<>());
    }

    public void addProduct(Product product){
       try{
           products.add(product);
       }catch (NullPointerException e){
           System.err.println(e.getMessage());
       }
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

}
