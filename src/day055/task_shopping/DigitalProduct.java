package day055.task_shopping;

public class DigitalProduct extends AbstractProduct implements IList,ICard{

    private byte[] content;

    public DigitalProduct(String code, String name, double price) {
        super(code, name, price);
    }

    public DigitalProduct() {
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public double checkOut() {
        return getPrice();
    }

    @Override
    public void display() {
        System.out.println(getName());
        System.out.println("-".repeat(30));
        System.out.println("Ürün Kodu     : "+getCode());
        System.out.println("Ürünün Fiyatı : "+getPrice());
        System.out.println("Download Link : http://download/"+getCode());
        System.out.println("-".repeat(30));
    }

    @Override
    public void list() {
        System.out.println(getCode()+"\t"+getName()+"\t"+getPrice());
    }
}
