package day054.tasks;

public class MainBall {
    public static void main(String[] args) {

        Ball ball1 = new Ball();

        System.out.println(ball1);


        //ball1.setColor(null);
        //ball1.setColor("");
        ball1.setColor("      Red       ");
        System.out.println(ball1.getColor());

        Ball ball2 = new Ball();
        ball2.setRadius(5.0);
        System.out.println(ball2);

    }
}
