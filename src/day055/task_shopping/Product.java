package day055.task_shopping;

public class Product extends AbstractProduct implements ICard,IList,Comparable<Product>{

    private double weight;

    public Product(String code, String name, double price, double weight) {
        super(code, name, price);
        setWeight(weight);
    }

    public Product() {
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight<1.0) {
            weight = 1.0;
        }
        this.weight = weight;
    }


    @Override
    public double checkOut() {
        double shipping = weight < 5 ? 8.75 : 12.0;
        return getPrice() + shipping;
    }

    @Override
    public void display() {
        System.out.println(getName());
        System.out.println("-".repeat(30));
        System.out.println("Ürün Kodu       : "+getCode());
        System.out.println("Ürünün Fiyatı   : "+getPrice());
        System.out.println("Ürünün Ağırlığı : "+getWeight());
        System.out.println("-".repeat(30));
    }

    @Override
    public void list() {
        System.out.println(getCode()+"\t"+getName()+"\t"+getPrice()+"\t"+getWeight());
    }

    @Override
    public String toString() {
        return String.format("(%s - %s - %.2f - %.2f)",getCode(),getName(),getPrice(),getWeight());
    }

    @Override
    public int compareTo(Product o) {
        return this.getCode().compareTo(o.getCode());
    }
}
