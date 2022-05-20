package day054.kargo;

public class MainKargo {
    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println(box1);

        Container container1 = new Container();
        System.out.println(container1);

        System.out.println();


        Container c1 = new Container();

        c1.load(new Box());
        c1.load(new Box());
        c1.load(new Box());

        System.out.printf("Kapasite    : %.4f\n",c1.getVolume());
        System.out.printf("Yük Miktarı : %.4f\n",c1.loadVolume());
        System.out.printf("Kalan Hacim : %.4f\n",c1.remainingVolume());

    }
}
