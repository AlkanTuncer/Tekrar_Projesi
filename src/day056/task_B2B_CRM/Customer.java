package day056.task_B2B_CRM;

public class Customer implements Accountable{

    private static int ID_GENERATOR;
    private int id;
    private String name;
    private Contact owner;
    private String address;
    private String phoneNumber;
    private double balance;

    public Customer(String name) {
        this.id = ++ID_GENERATOR;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Contact getOwner() {
        return owner;
    }
    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Costumer{" + "id=" + id + ", name='" + name + '\'' + ", owner=" + owner + '}';
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance<amount){
            throw new InsufficientBalanceException();
        }
        balance -= amount;
    }
}
