package day054.tasks;

public class Task1_2_3_4_5 {
    public static void main(String[] args) {

        drawLine(5,'*');
        drawLine(3);

    }

   // Task 1
    public static int getKare(int x){
        return x*x;  // (int)Math.pow(x,2);
    }

    /**
     * İki sayının toplamını verir.
     * @param a
     * @param b
     * @return
     */
    // Task 2
    public static int sum(int a,int b){
        return a+b;
    }

    // Task 3
    public static void showSum(double x,double y){
        System.out.println((x+y));
    }

    // Task 4
    public static void drawLine(int quantity,char symbol){
        for (int i = 0; i < quantity; i++) {     // sout'a yazarsak döngüsüz olur -> (""+symbol).repeat(quantity);
            System.out.print(symbol);
        }
    }

    // Task 5
    public static void drawLine(int quantity){
       drawLine(quantity,'-');   // Kod tekrarı olmaması için zaten yazdıgımız metotu kullanmalıyız.
    }

}


