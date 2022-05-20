package day056.task_B2B_CRM;

public class aaMain {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Lazkopat Dante","lazkopat53@gmail.com","+905535535353");

        System.out.println(contact1);
        System.out.println(new Contact("Alkan Tuncer","lorddarknessAT@hotmail.com","02125045888"));

        Customer customer1 = new Customer("Karadeniz Güveç Pide");
        customer1.setOwner(contact1);
        customer1.setAddress("Çavuşpaşa - Bahçelievler / İSTANBUL");
        customer1.setPhoneNumber("02125530053");

        System.out.println(customer1);

        // Hata Yönetimi
        customer1.deposit(1000);
        System.out.println("Customer Balance : "+customer1.getBalance());

        try {
            customer1.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Customer Balance : "+customer1.getBalance());
        }

    }
}
