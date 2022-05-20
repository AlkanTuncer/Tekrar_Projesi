package day055.task_shopping;

import java.util.ArrayList;

public class CheckOut {

    private ArrayList<AbstractProduct> products;

    public CheckOut() {
        products = new ArrayList<>();
    }

    public ArrayList<AbstractProduct> getProducts() {
        return products;
    }

    public void addProduct(AbstractProduct product){
        if (product != null) {
            products.add(product);
        }
    }

    public void removeProduct(AbstractProduct product){
        products.remove(product);
    }

    public double calculate(){
        double total = 0.0;
        for (AbstractProduct p : products){
            total += p.checkOut();
        }
        return total;
    }

}
